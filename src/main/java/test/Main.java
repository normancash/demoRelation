package test;

import model.Publicacion;
import model.TipoPublicacion;
import service.IDAO;
import service.ImplDAO;

import java.time.LocalDate;
import java.util.List;

public class Main {
    private static final IDAO dao = new ImplDAO();

    public static void main(String[] args) {
        /*TipoPublicacion tipoPublicacion = new TipoPublicacion();
        tipoPublicacion.setNombre("Revista");
        tipoPublicacion.setDescripcion("Revista desc");
        dao.create(tipoPublicacion);
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
        dao.create(p);
        dao.create(p2);*/
        List<Publicacion> lista = dao.getAll("Publicacion.all",Publicacion.class);
        lista.forEach(System.out::println);
    }
}
