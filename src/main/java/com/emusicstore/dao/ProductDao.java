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
    private List<Product> productList;

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

        Product product2 = new Product();
        product2.setProductName("Record 1");
        product2.setProductCategory("Record");
        product2.setProductDescription("This is awesome mix of modern pop music");
        product2.setProductPrice(25);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitInStock(51);
        product2.setProductManufacturer("EMI");

        Product product3 = new Product();
        product3.setProductName("Speaker 1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is Polk Shelf Speaker");
        product3.setProductPrice(355);
        product3.setProductCondition("New");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");

        // re-instanciates the list eveyrtime this method is called
        // so if there's a page reload, the list will be renewed and not add on existing products
        productList = new ArrayList<Product>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }
}
