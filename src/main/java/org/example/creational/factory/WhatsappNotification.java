package org.example.creational.factory;

public class WhatsappNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println(" Notified user via  whatsaapp");
    }
}
