package com.webservice.verify;

import com.webservice.dao.interfaces.ProductDao;
import com.webservice.verify.interfaces.VerifyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyProductImpl implements VerifyProduct {

    @Autowired
    private ProductDao productDao;

}
