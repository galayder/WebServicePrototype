package com.webservice.dao;

import com.webservice.dao.interfaces.ProductDao;
import com.webservice.models.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.OneToMany;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    @Autowired
    SessionFactory sessionFactory;

//    @Override
//    public List<Product> readByName(Class<Product> tClass, String name){
//        String hql = "FROM Product WHERE name = :name";
//        Query query = sessionFactory.getCurrentSession().createQuery(hql);
//        query.setParameter("name", name);
//        return query.list();
//    }

    @Override
    public Product readByName(Class<Product> tClass, String name){
        String hql = "FROM Product WHERE name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("name", name);
        return (Product) query.uniqueResult();
    }
}
