package org.example.behavioural.strategy;

public class BigBillionDaysDiscount implements DiscountStrategy{

    @Override
    public double discount(double amount) {
        return 0.85*amount;
    }
}
