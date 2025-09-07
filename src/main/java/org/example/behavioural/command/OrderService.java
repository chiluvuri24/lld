package org.example.behavioural.command;

import org.example.structurral.decorator.Product;
import org.example.structurral.facade.OrderFacade;

public class OrderService {
    OrderFacade facade = new OrderFacade();

    public void placeOrder(Product product){
        facade.placeOrder(product.description(), product.price());
    }

    public void cancelOrder(){
        System.out.println(" Cancelling the order ");
    }

}
