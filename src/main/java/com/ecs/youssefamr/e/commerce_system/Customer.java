package com.ecs.youssefamr.e.commerce_system;

public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer() { 
        this.customerId = 0;
        this.name = null;
        this.address = null;
    }

    public Customer(int id, String name, String address) {
        this.customerId = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.customerId = Math.abs(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }  
}
