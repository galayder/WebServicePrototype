package com.webservice.services;

import com.webservice.dao.interfaces.ProductDao;
import com.webservice.models.Product;
import com.webservice.services.interfaces.ProductService;
import com.webservice.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private DateUtils dateUtils;

    @Override
    public Product create(Product product) {
        product.setDate(dateUtils.getDateNow());
        return productDao.create(product);
    }

    @Override
    public Product readByName(String name) {
        return productDao.readByName(Product.class, name);
    }
}
