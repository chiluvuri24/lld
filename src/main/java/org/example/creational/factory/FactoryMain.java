package org.example.creational.factory;

public class FactoryMain {
    public static void main(String[] args){
//        Notification emailNotification = new EmailNotification();
//        emailNotification.notifyUser();
//        Notification smsNotification = new SMSNotification();
//        smsNotification.notifyUser();
        /*   The Above is the bad Design in future if we want to add another type of notification
             we need to create another object like above instead above
             create one Factory ask  what type of notification obj you want?
         */

        Notification emailNotification1 = NotificationFactory.createNotification("email");
        Notification smsNotification1 = NotificationFactory.createNotification("sms");
        emailNotification1.notifyUser();
        smsNotification1.notifyUser();




    }
}
