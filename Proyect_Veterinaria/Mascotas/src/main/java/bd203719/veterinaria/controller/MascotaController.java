package bd203719.veterinaria.controller;

import bd203719.veterinaria.model.Duenio;
import bd203719.veterinaria.model.DuenioMascota;
import bd203719.veterinaria.model.Mascota;
import bd203719.veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class MascotaController {

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/listMascotas")
    public List<Mascota> getMascotas(){
        List<Mascota> response = mascotaRepository.findAll();

        if (response != null){
            return response;
        }else {
            return null;
        }
    }
    @GetMapping(value="/mascota/{id}")
    public  Mascota getMascota(@PathVariable("id") int id){
        Mascota mascota = mascotaRepository.findById(id);
        return  mascota;
    }

    @GetMapping(value = "/listMascotasById/{id}")
    public List<Mascota> getDueniosbyId(@PathVariable("id") int id){
        return mascotaRepository.findAllById(id);
    }

    @PostMapping(value = "/mascota")
    public Mascota getMascota(@RequestBody Mascota mascota){
        return mascotaRepository.findByIdmascota(mascota.getIdmascota());
    }

    @PostMapping(value = "/mascota/add",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    @PostMapping(value = "/mascota/update")
    public Mascota updateMascota(@RequestBody Mascota mascota){
        Mascota m = mascotaRepository.findByIdmascota(mascota.getIdmascota());
        if(m != null) {
            m.setNombre(mascota.getNombre());
            m.setRazon(mascota.getRazon());
            m.setRaza(mascota.getRaza());
            m.setId(mascota.getId());
            return mascotaRepository.save(m);
        }else
            return null;
    }

    @PostMapping(value = "/mascota/delete")
    public Boolean deleteMascota(@RequestBody Mascota mascota){
        Mascota m = mascotaRepository.findByIdmascota(mascota.getIdmascota());
        if (m != null){
            mascotaRepository.delete(m);
            return true;
        }else
            return null;
    }
}
