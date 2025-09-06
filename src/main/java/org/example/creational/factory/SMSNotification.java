package org.example.creational.factory;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println(" Notified user via  SMS");
    }
}
