package org.example.structurral.decorator;

public abstract class ProductDecorator implements Product {

    protected Product product;

    ProductDecorator(Product product){
        this.product=product;
    }

}
