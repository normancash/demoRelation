package test;

import model.Publicacion;
import model.TipoPublicacion;
import service.IDAO;
import service.ImplDAO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static final IDAO dao = new ImplDAO();

    public static void main(String[] args) {
        TipoPublicacion tipoPublicacion = new TipoPublicacion();
        tipoPublicacion.setNombre("Revista");
        tipoPublicacion.setDescripcion("Revista desc");

        Publicacion p = new Publicacion();
        p.setFecha(LocalDate.now());
        p.setTitulo("Revista deportiva");
        p.setDescripcion("Revista deportiva desc");
        p.setTipoPublicacion(tipoPublicacion);

        Publicacion p2 = new Publicacion();
        p2.setFecha(LocalDate.now());
        p2.setTitulo("Revista Tecnologica");
        p2.setDescripcion("Revista Tecnologica desc");
        p2.setTipoPublicacion(tipoPublicacion);

        Set<Publicacion> publicaciones = new HashSet<Publicacion>();
        publicaciones.add(p);
        publicaciones.add(p2);
        tipoPublicacion.setPublicaciones(publicaciones);
        dao.create(tipoPublicacion);

        List<TipoPublicacion> lista = dao.getAll("TipoPublicacion.all",TipoPublicacion.class);
        lista.forEach(System.out::println);
    }
}
