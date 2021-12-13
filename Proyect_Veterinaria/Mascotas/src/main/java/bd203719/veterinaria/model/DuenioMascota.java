package bd203719.veterinaria.model;

import java.util.List;

public class DuenioMascota extends Mascota{
    private List<Duenio> duenios;

    public DuenioMascota() {
    }

    public DuenioMascota(int idmascota, String nombre, String razon, String raza, int id, List<Duenio> duenios) {
        super(idmascota, nombre, razon, raza, id);
        this.duenios = duenios;
    }

    public List<Duenio> getDuenios() {
        return duenios;
    }

    public void setDuenios(List<Duenio> duenios) {
        this.duenios = duenios;
    }
}
