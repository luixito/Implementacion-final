package bd203719.veterinaria.controller;

import bd203719.veterinaria.model.Medicamento;
import bd203719.veterinaria.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MedicamentoController {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    @GetMapping(value = "/listMedicamentos")
    public List<Medicamento> getMedicamentos(){
        List<Medicamento> response = medicamentoRepository.findAll();

        if (response != null){
            return response;
        }else {
            return null;
        }
    }

    @PostMapping(value = "/medicamento")
    public Medicamento getMedicamento(@RequestBody Medicamento medicamento){
        return medicamentoRepository.findByIdmedicamento(medicamento.getIdmedicamento());
    }

    @PostMapping(value = "/medicamento/add",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Medicamento addMedicamento(@RequestBody Medicamento medicamento){ return medicamentoRepository.save(medicamento); }

    @PostMapping(value = "/medicamento/update")
    public  Medicamento updateMedicamento(@RequestBody Medicamento medicamento){
        Medicamento m = medicamentoRepository.findByIdmedicamento(medicamento.getIdmedicamento());
        if(m != null) {

            m.setNombre(medicamento.getNombre());
            m.setTipo(medicamento.getTipo());
            m.setRaza(medicamento.getRaza());

            return medicamentoRepository.save(m);
        }else
            return null;
    }

    @PostMapping(value = "/medicamento/delete")
    public Boolean deleteMedicamento(@RequestBody Medicamento medicamento){
        Medicamento m = medicamentoRepository.findByIdmedicamento(medicamento.getIdmedicamento());
        if (m != null) {
            medicamentoRepository.delete(m);
            return  true;
        } else
            return false;
    }
}

