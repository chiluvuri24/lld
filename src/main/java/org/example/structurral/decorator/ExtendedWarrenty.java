package org.example.structurral.decorator;

public class ExtendedWarrenty extends ProductDecorator{


    ExtendedWarrenty(Product product) {
        super(product);
    }


    @Override
    public String description() {
        return product.description()+" Added Extended Warrenty";
    }

    @Override
    public double price() {
        return product.price()+ (product.price()*0.2);
    }
}
