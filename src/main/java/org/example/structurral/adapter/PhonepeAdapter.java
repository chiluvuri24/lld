package org.example.structurral.adapter;

public class PhonepeAdapter  implements PaymentPreProcessor {
    private Phonepe phonepe;

    public PhonepeAdapter(Phonepe phonepe){
        this.phonepe= phonepe;
    }

    @Override
    public void pay(double amount){
        phonepe = Phonepe.getPhonepeInstance();
        phonepe.payViaPhonepe(amount);
    }
}
