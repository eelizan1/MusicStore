package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    // define a product dao instance to be used to get product details
    private ProductDao productDao = new ProductDao();

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
        List<Product> products = productDao.getProductList();

        // bind the product object to the model
        // name: "products"
        // value: "products"
        model.addAttribute("products", products);
        // when we return this view, the model will be attached to the view
        return "productList"; // view jsp file name
    }

    // view single product
    @RequestMapping("productList/viewProduct")
    public String viewProduct() {
        return "viewProduct";
    }
}
