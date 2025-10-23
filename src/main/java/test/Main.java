package test;

import model.Publicacion;
import service.IDAO;
import service.ImplDAO;

import java.time.LocalDate;
import java.util.List;

public class Main {
    private static final IDAO dao = new ImplDAO();

    public static void main(String[] args) {
        Publicacion p = new Publicacion();
        p.setFecha(LocalDate.now());
        p.setTitulo("Test2");
        p.setDescripcion("Test2");
        dao.create(p);
        List<Publicacion> lista = dao.getAll("Publicacion.all",Publicacion.class);
        lista.forEach(System.out::println);
    }
}
