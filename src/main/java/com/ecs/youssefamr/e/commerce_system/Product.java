package com.ecs.youssefamr.e.commerce_system;

public class Product {
    private int productId;
    private String Name;
    private float price;
    
    public Product(){
        productId = 0;
        Name = null;
        price = 0.0f;
    }
    
    public Product(int id, String name, float price){
        this.productId = Math.abs(id);
        this.Name = name;
        this.price = Math.abs(price);
    }

    public int getID() {
        return productId;
    }

    public String getName() {
        return Name;
    }

    public float getPrice() {
        return price;
    }

    public void setID(int ID) {
        this.productId = Math.abs(ID);
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    } 
}
