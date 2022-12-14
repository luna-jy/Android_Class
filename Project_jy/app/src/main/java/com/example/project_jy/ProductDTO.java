package com.example.project_jy;


import java.io.Serializable;

public class ProductDTO implements Serializable {

        private String name;
        private int price, qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public ProductDTO(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
