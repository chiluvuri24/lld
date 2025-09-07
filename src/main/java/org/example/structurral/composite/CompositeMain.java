package org.example.structurral.composite;

public class CompositeMain {

    public static void main(String[] args) {
        Item ps5 = new Item("Gaming console", 50000.00);
        Item ps5Controller = new Item("Gaming Controller", 10000.00);
        Item fifa = new Item(" Video Game FIFA ", 3000.00);




        ProductBundle summerSaleGamingBundle = new ProductBundle(" Gaming Bundle for the summer season");
        summerSaleGamingBundle.addToProductList(ps5);
        summerSaleGamingBundle.addToProductList(ps5Controller);
        summerSaleGamingBundle.addToProductList(fifa);


        System.out.println(summerSaleGamingBundle.description()+ ", Total Price : " + summerSaleGamingBundle.price());
    }

}
