package com.sumanth.samplewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumanth.samplewebapp.model.Product;
import com.sumanth.samplewebapp.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

}
