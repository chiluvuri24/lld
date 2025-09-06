package org.example.creational.factory;

public class TelegramNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println(" Notified user via  Telegram");
    }
}
