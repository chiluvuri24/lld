package org.example.behavioural.observer;

public class ObserverMain {

    public static void main(String[] args) throws InterruptedException {
        Order order = new Order();
        order.addObserver(new SMSNotifier());
        order.addObserver(new MailNotifier());
        order.addObserver(new WhatsappNotifier());

        order.updateStatus("SHIPPED");
        Thread.sleep(2000);
        order.updateStatus("IN_TRANSIT");
        Thread.sleep(2000);
        order.updateStatus("OUT_FOR_DELIVERY");
        Thread.sleep(2000);
        order.updateStatus("DELIVERED");


    }

}
