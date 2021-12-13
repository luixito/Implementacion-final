package bd203719.veterinaria.model;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.*;

@Entity
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmedicamento;

    @Column(name="nombre")
    private String nombre;

    @Column(name="tipo")
    private String tipo;

    @Column(name="raza")
    private String raza;

    public Medicamento() {
    }

    public Medicamento(int idmedicamento, String nombre, String tipo, String raza) {
        this.idmedicamento = idmedicamento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
    }

    public int getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
