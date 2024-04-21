package com.ecs.youssefamr.e.commerce_system;
import java.util.Scanner;

public class EcommerceSystem {
    
    public static void main(String[] args) { 
        Cart cart = new Cart();
        ElectronicProduct EP = new ElectronicProduct(1, "smartphone", 599.99f, "Samsung", 1);
        ClothingProduct CP = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        BookProduct BP = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");
        Customer customer = new Customer();

        Scanner input = new Scanner(System.in);
         
        System.out.println("Welcome to the E-Commerce System!");
        customer = SetCustomer(customer);
        cart = setCart(cart,customer);
        
        int c;
        for (int i = 0; i < cart.getnProducts(); i++) {
            System.out.println("Which product would you like to add ?"
                    + " 1- " + EP.getName() + " 2- " + CP.getName() + " 3- " + BP.getName());
            while (true) {                
                try {
                    c = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("invalid input");
                }
            }
            switch(c){
                case 1:
                    cart.addProduct(EP);
                    break;
                
                case 2:
                    cart.addProduct(CP);
                    break;
                
                case 3:
                    cart.addProduct(BP);
                    break;
                
                default:
                    System.out.println("invalid input");
                    i--;
                    break;
            }
        }
        System.out.println("Your total is $" + cart.calculatePrice() + 
                ". Would you like to place the order? 1- Yes 2- No");
        while (true) {            
            try {
                c = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
        switch(c){
            case 1:
                Order order = cart.placeOrder();
                order.printOrderInfo();
            case 2:
                System.out.print("\nthinks for using my E-Commerce System. \\^o^/");
                break;
        }
        
        
        
        
    }
  
    static Customer SetCustomer(Customer customer){
        while (true) {            
             try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter your id");
                customer.setId(input.nextInt());
                System.out.println("Please enter your name");
                customer.setName(input.next());
                System.out.println("Please enter you address");
                customer.setAddress(input.next());
                break;
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
        return customer;
    }
    
    static Cart setCart(Cart cart,Customer customer){
        cart.setCustomerId(customer.getId());
        while (true) {            
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("How many prodects you want to add to your cart?");
                cart.setnProducts(input.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
        return cart;
    }
    
}
