package org.example.structurral.composite;

import org.example.structurral.decorator.Product;

public class Item implements Product {

    String description;
    double price;

    public Item(String description,double price){
        this.description=description;
        this.price=price;
    }


    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
        return price;
    }
}
