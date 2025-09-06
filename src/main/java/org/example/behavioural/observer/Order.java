package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<OrderObserver> orderObserverList = new ArrayList<>();
    public void addObserver(OrderObserver orderObserver){
        orderObserverList.add(orderObserver);
    }

    public void removeObserver(OrderObserver orderObserver){
        orderObserverList.remove(orderObserver);
    }

    public void updateStatus(String status){
        this.status=status;
        notifyObservers();
    }

    public void notifyObservers(){
        for(OrderObserver orderObserver:orderObserverList){
            orderObserver.update(this.status);
        }
    }




}
