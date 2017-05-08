package com.webservice.dao.interfaces;

import com.webservice.models.Product;

public interface ProductDao extends GenericDao<Product> {

//    List<Product> readByName(Class<Product> tClass, String name);
    Product readByName(Class<Product> tClass, String name);

}
