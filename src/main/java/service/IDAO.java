package service;

import model.Publicacion;

import java.util.List;

public interface IDAO {

    <T> List<T> getAll(String namequery, Class<T> clazz);
    <T> void create(T entity);
}
