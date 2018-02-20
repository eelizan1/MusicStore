package com.emusicstore.dao.impl;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* DAO Design - Have an interface then an interface implementation
* So that later you can override the data by the interface
* */

@Repository // --> lets spring know this class is for database
@Transactional // --> lets spring hibernate know how to deal with the transactions
public class ProductDaoImpl implements ProductDao {

    @Autowired // finds where sessionFactory is at so it can be used
    private SessionFactory sessionFactory;

    // methods from interface
    public void addProduct(Product product) {
        // retrieve current session
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush(); // only when you flush the session object will be executed
    }

    public Product getProductById(String id) {
        // get current session
        Session session = sessionFactory.getCurrentSession();
        // use session to get a product class - lets hibernate know its a class and will try to find the class with it's primary ley (id)
        // need to cast it as product (Product). Left is product type, right is object type
        Product product = (Product) session.get(Product.class, id);
        session.flush();

        return product;
    }

    // return all products
    public List<Product> getAllProducts() {
        // get current session
        Session session = sessionFactory.getCurrentSession();
        // query statement to get all products from product table
        Query query = session.createQuery("from Product");
        // make a list with the query result
        List<Product> products = query.list();
        session.flush();

        return products;
    }

    // delete product with id
    // use getProductById()
    public void deleteProduct(String id) {
        // get current session
        Session session = sessionFactory.getCurrentSession();
        session.delete(getProductById(id));
        session.flush();
    }
}
