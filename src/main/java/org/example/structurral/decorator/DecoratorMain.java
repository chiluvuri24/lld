package org.example.structurral.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Product product = new BasicProduct("Laptop ",50000);

        Product warrenty = new ExtendedWarrenty(product);

        //System.out.println(warrenty.description()+" -------- "+warrenty.price());

        GiftWarpProduct warpProduct = new GiftWarpProduct(warrenty);

        System.out.println(warpProduct.description()+" -------- "+warpProduct.price());

    }
}
