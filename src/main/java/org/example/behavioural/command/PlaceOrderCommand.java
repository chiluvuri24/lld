package org.example.behavioural.command;

import org.example.structurral.decorator.Product;

public class PlaceOrderCommand implements Command{

    private OrderService orderService;

    public PlaceOrderCommand(OrderService orderService) {
        this.orderService = orderService;
    }
    @Override
    public void execute(Product product) {
        orderService.placeOrder(product);
    }


    @Override
    public void undo(Product product) {
        orderService.cancelOrder();
    }

}
