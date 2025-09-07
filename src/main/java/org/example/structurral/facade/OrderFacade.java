package org.example.structurral.facade;

public class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade(){
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void placeOrder(String item, double price){
        System.out.println(" Processing order for item ::"+item);
        inventory.updateStock(item);
        payment.processpayment(price);
        shipping.shipment(item);
        System.out.println(" Ordered Soon it will receive.....");
    }

}
