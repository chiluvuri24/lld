package org.example.behavioural.observer;

import org.example.creational.builder.Order;

public class SMSNotifier implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println(" SMS : Your order with Order Id #ORD_68276552u88782 has been :"+status);
    }
}
