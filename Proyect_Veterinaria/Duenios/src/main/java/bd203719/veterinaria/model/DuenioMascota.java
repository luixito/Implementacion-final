package bd203719.veterinaria.model;

import java.util.List;

public class DuenioMascota extends Duenio{

    private List<Mascota> mascotas;

    public DuenioMascota(int id, String nombre, String telefono, String direccion, List<Mascota> mascotas) {
        super(id, nombre, telefono, direccion);
        this.mascotas = mascotas;
    }

    public DuenioMascota(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public DuenioMascota() {
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
