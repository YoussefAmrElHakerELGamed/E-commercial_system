package com.ecs.youssefamr.e.commerce_system;
import java.util.ArrayList;

public class Cart {
    private int customerId, nProducts;
    private ArrayList<Product> products;

    public Cart() {
        this.customerId = 0;
        this.nProducts = 0;
        this.products = new ArrayList<Product>(0);
    }

    public Cart(int customerId, int nProducts, ArrayList<Product> products) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
    
    public float calculatePrice(){
        float p = 0.0f;
        for (int i = 0; i < products.size(); i++) {
            p += products.get(i).getPrice();
        }
        return p;
    }
    
    public Order placeOrder(){
        Order order = new Order(getCustomerId(), 1, calculatePrice(), products);
        return order;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }   
}
