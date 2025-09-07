package org.example.structurral.decorator;

public class GiftWarpProduct extends ProductDecorator{

    public GiftWarpProduct(Product product){
        super(product);
    }


    @Override
    public String description() {
        return product.description()+" also adding Gift wrap to it";
    }

    @Override
    public double price() {
        return product.price()+ 10.0;
    }
}
