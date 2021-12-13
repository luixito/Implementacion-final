package bd203719.veterinaria.controller;

import bd203719.veterinaria.model.Duenio;
import bd203719.veterinaria.model.DuenioMascota;
import bd203719.veterinaria.model.Mascota;
import bd203719.veterinaria.repository.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class DuenioController {

    @Autowired
    DuenioRepository duenioRepository;

    @Autowired
    RestTemplate restTemplate;


    @GetMapping(value = "/listDuenios")
    public List<Duenio> getDuenios(){


        List<Duenio> response = duenioRepository.findAll();

        if (response != null){
            return response;
        }else {
            return null;
        }
    }

    @GetMapping(value = "/listDueniosById/{id}")
    public List<Duenio> getDueniosbyId(@PathVariable("id") int id){
        return duenioRepository.findAllById(id);
    }

    @GetMapping(value="/duenio/{id}")
    public  Duenio getMascota(@PathVariable("id") int id){
        Duenio duenio = duenioRepository.findById(id);
        return  duenio;
    }


    @GetMapping(value= "/{id}")
    public Duenio getDuenio(@PathVariable("id") int id) {
        Duenio duenio = restTemplate.getForObject(
                "http://localhost:15432/mascota/" + id, Duenio.class);
        return duenio;
    }

    @GetMapping(value = "/{id}/Duenios")
    public DuenioMascota getDuenioMascota(@PathVariable("id")int id){
        DuenioMascota duenioMascota = restTemplate.getForObject("http://localhost:13306/duenio/"
                 + id,DuenioMascota.class);

        Mascota[] mascotas = restTemplate.getForObject("http://localhost:15432/listMascotasById/"+id,Mascota[].class);
        duenioMascota.setMascotas(Arrays.asList(mascotas));

        return duenioMascota;
    }

    @PostMapping(value = "/duenio")
    public Duenio getDuenio(@RequestBody Duenio duenio){
        return duenioRepository.findById(duenio.getId());
    }

    @PostMapping(value = "/duenio/add",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Duenio addDuenio(@RequestBody Duenio duenio){
        return duenioRepository.save(duenio);
    }

    @PostMapping(value = "/duenio/update")
    public Duenio updateDuenio(@RequestBody Duenio duenio){
        Duenio d = duenioRepository.findById(duenio.getId());
        if(d != null) {

            d.setNombre(duenio.getNombre());
            d.setTelefono(duenio.getTelefono());
            d.setDireccion(duenio.getDireccion());
            return duenioRepository.save(d);
        }else
            return null;
    }

    @PostMapping(value = "/duenio/delete")
    public Boolean deleteDuenio(@RequestBody Duenio duenio){
        Duenio d = duenioRepository.findById(duenio.getId());
        if (d != null){
            duenioRepository.delete(d);
            return true;
        }else
            return null;
    }

}
