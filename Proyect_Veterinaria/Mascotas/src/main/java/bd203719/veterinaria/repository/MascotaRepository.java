package bd203719.veterinaria.repository;

import bd203719.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MascotaRepository
        extends CrudRepository<Mascota, String> {

    List<Mascota> findAll();

    List<Mascota> findAllById(int id);


    Mascota findByIdmascota(int idmascota);

    Mascota findById(int id);

    Mascota save(Mascota mascota);

    void delete(Mascota mascota);
}
