package com.ecs.youssefamr.e.commerce_system;
import java.util.ArrayList;

public class Order {
    private int customerId, orderId;
    private float totalPrice;
    private ArrayList<Product> products = new ArrayList<Product>(1);

    public Order() {
        this.customerId = 0;
        this.orderId = 0;
        this.totalPrice = 0;
        this.products = null;
    }

    public Order(int customerId, int orderId, float totalPrice, ArrayList<Product> products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.totalPrice = Math.abs(totalPrice);
        this.products = products;
    }
    
    public void printOrderInfo(){
        System.out.println("Order ID: " + orderId +"\nCustomer ID: " + customerId
        + "\nProducts: ");
        printProdects();
    }
    
    private void printProdects(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName() + " - $" 
            + products.get(i).getPrice());
        }
        System.out.println("\nTotal Price: $" + totalPrice);
    } 

    public int getCustomerId() {
        return customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
