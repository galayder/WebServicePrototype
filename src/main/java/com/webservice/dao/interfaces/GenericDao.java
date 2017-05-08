package com.webservice.dao.interfaces;

public interface GenericDao<T> {

    public T create(T t);
    public T read(Class<T> tClass, Long id);
    public T update(T t);
    public T delete(T t);
}
