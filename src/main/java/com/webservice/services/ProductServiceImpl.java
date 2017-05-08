package com.webservice.services;

import com.webservice.dao.interfaces.ProductDao;
import com.webservice.models.Product;
import com.webservice.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public Product create(Product product) {
        return productDao.create(product);
    }
}
