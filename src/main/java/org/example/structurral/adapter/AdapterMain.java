package org.example.structurral.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        PaymentPreProcessor razorpayPaymentPreprocessor = new PhonepeAdapter(new Phonepe());
        razorpayPaymentPreprocessor.pay(1000.00);




        PaymentPreProcessor stripePaymentPreprocessor = new PaypalAdapter(new Paypal());
        stripePaymentPreprocessor.pay(100.00);

    }
}
