package org.example.structurral.facade;

public class FacadeClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Air Conditioner ",35000);
    }
}
