package org.example.behavioural.observer;

public class MailNotifier implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println(" MAil : Your order with Order Id #ORD_68276552u88782 has been :"+status);
    }
}
