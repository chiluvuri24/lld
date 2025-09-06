package org.example.behavioural.strategy;

public class CouponDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double amount) {
        return 0.75*amount;
    }
}
