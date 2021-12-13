package bd203719.veterinaria.repository;

import bd203719.veterinaria.model.Medicamento;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MedicamentoRepository
        extends CrudRepository<Medicamento, String> {

    List<Medicamento> findAll();

    Medicamento findByIdmedicamento(int idmedicamento);

    Medicamento save(Medicamento medicamento);

    void delete(Medicamento medicamento);
}
