package org.example.structurral.composite;

import org.example.structurral.decorator.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements Product {
    String description;
    List<Product> prodList = new ArrayList<>();

    public ProductBundle(String description){
        this.description = description;
    }

    public void addToProductList(Product product){
        prodList.add(product);
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
        return prodList.stream().mapToDouble(Product::price).sum();
    }

}
