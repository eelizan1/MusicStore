package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/*
dao - Database Access object
General design pattern that you separate the domain model from the data accessing models

Used to grab data from database
* */
public class ProductDao {
    // list of products
    private List<Product> productList = new ArrayList<Product>();

    public List<Product> getProductList() {

        // dummy data
        Product product1 = new Product();
        product1.setProductName("Guitar 1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender Strat Guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        productList.add(product1);

        return productList;
    }
}
