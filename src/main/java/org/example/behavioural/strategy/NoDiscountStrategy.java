package org.example.behavioural.strategy;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double discount(double amount) {
        return amount;
    }
}
