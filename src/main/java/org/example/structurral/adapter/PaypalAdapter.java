package org.example.structurral.adapter;

public class PaypalAdapter implements PaymentPreProcessor {
    public Paypal paypal;

    public PaypalAdapter(Paypal paypal){
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount){
        paypal = Paypal.getPaypalInstance();
        paypal.paypalPaymment(amount);
    }
}
