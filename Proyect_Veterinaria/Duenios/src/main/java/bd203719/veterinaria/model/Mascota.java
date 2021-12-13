package bd203719.veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmascota")
    private int idmascota;

    @Column(name="nombre")
    private String nombre;

    @Column(name="razon")
    private String razon;

    @Column(name="raza")
    private String raza;

    @Column(name="id")
    private int id;

    public Mascota() {
    }

    public Mascota(int idmascota, String nombre, String razon, String raza, int id) {
        this.idmascota = idmascota;
        this.nombre = nombre;
        this.razon = razon;
        this.raza = raza;
        this.id = id;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}