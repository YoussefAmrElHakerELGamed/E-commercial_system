package com.ecs.youssefamr.e.commerce_system;

public class ClothingProduct extends Product {
    private String size,fabric;

    public ClothingProduct() {
        super();
        this.size = null;
        this.fabric = null; 
    }

    public ClothingProduct(int id , String name, float price,String size, String fabric) {
        super(id,name,price);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
