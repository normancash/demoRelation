package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="TipoPublicacion")
@NamedQueries({
        @NamedQuery(name="TipoPublicacion.all",query="select e from TipoPublicacion e")
})
public class TipoPublicacion {

    @Id
    @SequenceGenerator(name="tipoPubSeq"
            ,sequenceName = "tipoPubSeq"
            ,allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tipoPubSeq")
    private int id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "tipoPublicacion",cascade = CascadeType.ALL)
    private Set<Publicacion> publicaciones;

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

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @Override
    public String toString() {
        return "TipoPublicacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", publicaciones=" + publicaciones +
                '}';
    }
}
