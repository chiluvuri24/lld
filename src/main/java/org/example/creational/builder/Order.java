package org.example.creational.builder;

public class Order {
    private String product;
    private String color;
    private String size;
    private boolean giftWrapped;
    private boolean bankOfferApplicable;
    private boolean isPrimeDelivery;

    public Order(OrderBuilder builder) {
        this.product = builder.product;
        this.color = builder.color;
        this.size = builder.size;
        this.giftWrapped = builder.giftWrapped;
        this.bankOfferApplicable = builder.bankOfferApplicable;
        this.isPrimeDelivery = builder.isPrimeDelivery;
    }

}

class OrderBuilder {
    public String product;
    public String color;
    public String size;
    public boolean giftWrapped;
    public boolean bankOfferApplicable;
    public boolean isPrimeDelivery;

    public OrderBuilder(String product) {
        this.product = product;
    }

    public OrderBuilder color(String color){
        this.color=color;
        return this;
    }

    public OrderBuilder size(String size){
        this.size=size;
        return this;
    }

    public OrderBuilder giftWrapped(boolean giftWrapped){
        this.giftWrapped=giftWrapped;
        return this;
    }

    public OrderBuilder bankOfferApplicable(boolean bankOfferApplicable){
        this.bankOfferApplicable=bankOfferApplicable;
        return this;
    }

    public OrderBuilder isPrimeDelivery(boolean isPrimeDelivery){
        this.isPrimeDelivery=isPrimeDelivery;
        return this;
    }

    public Order build(){
        return new Order(this);
    }

}
