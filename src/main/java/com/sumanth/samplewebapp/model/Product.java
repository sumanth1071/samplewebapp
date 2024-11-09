package com.sumanth.samplewebapp.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// @AllArgsConstructor
// @AllArgsConstructor is used to get contructor automatically
@Component
public class Product {
    
    private int prodId;
    private String prodName;
    private int price;

    public Product(){

    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getprodId(){
        return prodId;
    }

    public void setprodId(){
        this.prodId =  prodId;
    }

    public String getprodName(){
        return prodName;
    }

    public void setprodName(){
        this.prodName = prodName;
    }

    public int getprice(){
        return price;
    }

    public void setprice(){
        this.price = price;
    }
}