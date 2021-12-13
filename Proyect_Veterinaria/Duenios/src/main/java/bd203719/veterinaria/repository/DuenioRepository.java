package bd203719.veterinaria.repository;

import bd203719.veterinaria.model.Duenio;
import bd203719.veterinaria.model.DuenioMascota;
import bd203719.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DuenioRepository
        extends CrudRepository<Duenio, String> {

    List<Duenio> findAll();

    List<Duenio> findAllById(int id);

    Duenio findById(int id);




    Duenio save(Duenio duenio);

    void delete(Duenio duenio);
}
