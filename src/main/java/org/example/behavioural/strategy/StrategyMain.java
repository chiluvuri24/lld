package org.example.behavioural.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new BigBillionDaysDiscount());
        double price = 1890;
        System.out.println(" Cart Price ::"+price+" After Discount ::"+shoppingCart.checkout(1890));

    }
}
