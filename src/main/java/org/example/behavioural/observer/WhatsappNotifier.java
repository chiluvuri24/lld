package org.example.behavioural.observer;

public class WhatsappNotifier implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println(" Whatsapp : Your order with Order Id #ORD_68276552u88782 has been :"+status);
    }
}
