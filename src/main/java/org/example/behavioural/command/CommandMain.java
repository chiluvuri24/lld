package org.example.behavioural.command;

import org.example.structurral.composite.Item;
import org.example.structurral.decorator.Product;

public class CommandMain {
    public static void main(String[] args) {
        Product ps5 = new Item("PS5 Console",50000);
        OrderService orderService = new OrderService();
        Command placeOrderCommand = new PlaceOrderCommand(orderService);


        placeOrderCommand.execute(ps5);

    }
}
