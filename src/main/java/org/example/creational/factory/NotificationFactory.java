package org.example.creational.factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
          if(type.equalsIgnoreCase("EMAIL")){
              return new EmailNotification();
          } else if (type.equalsIgnoreCase("SMS")) {
              return new SMSNotification();
          } else if (type.equalsIgnoreCase("TELEGRAM")) {
              return new TelegramNotification();
          } else if (type.equalsIgnoreCase("WHATSAPP")) {
              return new WhatsappNotification();
          } else {
              throw new IllegalArgumentException("Invalid notification type");
          }
    }
}
