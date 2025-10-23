package model;

import jakarta.persistence.*;

@Entity
@Table(name="tipopublicacion")
public class TipoPublicacion {

    @Id
    @SequenceGenerator(name="tipoPubSeq",sequenceName = "tipoPubSeq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tipoPubSeq")
    private int id;
    private String nombre;
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
