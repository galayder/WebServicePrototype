package com.webservice.dao;

import com.webservice.dao.interfaces.ProductDao;
import com.webservice.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

}
