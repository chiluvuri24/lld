package org.example.structurral.adapter;

public class Paypal {
    private static volatile Paypal paypalInstance;

    public Paypal(){
        System.out.println(" Paypal Obj Instantiated ");
    }

    public static Paypal getPaypalInstance(){
        if(paypalInstance == null){
            synchronized (Paypal.class){
                if(paypalInstance == null){
                    paypalInstance = new Paypal();
                }
            }
        }
        return paypalInstance;
    }

    public void paypalPaymment(double amount){
        System.out.println(" Payment of "+amount+" has been paid by paypal!");
    }
}
