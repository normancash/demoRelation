package model;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@Table(name="publicacion")
@NamedQueries({
        @NamedQuery(name="Publicacion.all"
                ,query="select e from Publicacion e")
   }
)
public class Publicacion {
    @Id
    @SequenceGenerator(name="publicacionSEQ",
                       sequenceName = "publicacion_seq",
                       allocationSize=1,
            initialValue=1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "publicacionSEQ"
    )
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
