package com.ecs.youssefamr.e.commerce_system;

public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct() {
        super();
        this.brand = null;
        this.warrantyPeriod = 0;
    }

    public ElectronicProduct(int id,String name , float price,String brand, int warrantyPeriod) {
        super(id,name,price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    } 
}
