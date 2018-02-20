package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    // define a product dao instance to be used to get product details
    //private ProductDao productDao = new ProductDao();
    @Autowired
    private ProductDao productDao;

    // mapping path
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    // mapping url path to product list
    @RequestMapping("/productList")
    public String getProducts(Model model) {
        // note - the model parameter will be attached to the view

        // create list of products
        List<Product> products = productDao.getAllProducts();

        // bind the product object to the model
        // name: "products"
        // value: "products"
        model.addAttribute("products", products);
        // when we return this view, the model will be attached to the view
        return "productList"; // view jsp file name
    }

    // view single product
    // {productId} path variable
    @RequestMapping("productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException {
        // the parameter String productId will have the contents of {productId}

        // to return a product with this id
        Product product = productDao.getProductById(productId);
        // add product to model
        model.addAttribute(product);
        return "viewProduct";
    }

    // maps to the admin page
    @RequestMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    // maps to the admin inventory page
    @RequestMapping("/admin/productInventory")
    public String InventoryPage(Model model) {
        List<Product> product = productDao.getAllProducts();
        model.addAttribute("products", product);

        return "productInventory";
    }

    // map to the add product page
    @RequestMapping("/admin/productInventory/addProduct")
    public String adminPage(Model model) {
        Product product = new Product();
        product.setProductCategory("instrument");
        product.setProductCondition("new");
        product.setProductStatus("Active");

        model.addAttribute("product", product);

        return "addProduct"; 
    }
}
