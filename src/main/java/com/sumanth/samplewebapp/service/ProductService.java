package com.sumanth.samplewebapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sumanth.samplewebapp.model.Product;

@Service 
// @Service is also a component so it can be used
public class ProductService {
    
    List<Product> products = Arrays.asList(
        new Product(101,"realme",18000),
        new Product(111, "macbook", 100000),
        new Product(112,"airpods",15000));

    public List<Product> getProducts(){
        return products;
    }

}
