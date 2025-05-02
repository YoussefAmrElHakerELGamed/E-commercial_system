# 🛒 E-Commerce System – Supermarket Edition

A beginner-friendly object-oriented **Java application** that simulates a basic e-commerce system for a supermarket. Designed using **7 core classes** and a **main controller class**, it demonstrates inheritance, composition, encapsulation, and interaction between objects like products, customers, carts, and orders.

---

## 🧰 Technologies Used

| Component     | Technology  |
|---------------|-------------|
| Language      | Java        |
| Paradigm      | OOP         |
| IDE           | NetBeans / IntelliJ / VS Code |
| Execution     | Console Application |

---

## 🛠️ Classes Overview

### 📦 `Product` (Base Class)
- Holds core product data: `productId`, `productName`, `productPrice`.
- All standard getters and setters included.

### 📚 `BookProduct` (Extends Product)
- Adds: `author`, `publisher`

### 👕 `ClothingProduct` (Extends Product)
- Adds: `size`, `fabricMaterial`

### 🔌 `ElectronicProduct` (Extends Product)
- Adds: `brand`, `warrantyPeriod`

---

## 🛒 `Cart` Class

A central class that handles the cart logic:
- Parameters: `cartId`, `numberOfProducts`, `productList`
- Methods:
  - `addProduct()`
  - `removeProduct()`
  - `calculatePrice()`
  - `placeOrder()`

---

## 🧍 `Customer` Class

Stores customer details:
- Parameters: `customerId`, `customerName`, `customerAddress`

---

## 🧾 `Order` Class

Handles final billing:
- Parameters: `customerId`, `productList`, `totalPrice`
- Method: `printOrderInfo()` – prints the full receipt

---

## 🚦 Main Application Flow

1. Initialize a `Customer` and a new `Cart`.
2. Create one of each product type: `Book`, `Clothing`, `Electronic`.
3. Print the program title and cart/customer info.
4. Show the main menu to select products for purchase.
5. Confirm purchase and print the bill via `Order` class.
6. End the program with a thank-you message.

---

## 🌟 Features

- 🧱 Strong OOP design with inheritance and composition
- 📦 Supports multiple product types
- 🛒 Dynamic cart management
- 🧾 Printable order summaries
- 🎉 Clean CLI interaction with menu and confirmations

---

## 🧗 Challenges Faced & How We Solved Them

| Challenge | Solution |
|----------|----------|
| Structuring product types with minimal code duplication | Used inheritance (Book, Clothing, Electronic from Product) |
| Managing multiple products in a cart | Used composition with `ArrayList<Product>` and custom add/remove methods |
| Simulating real-world interaction | Added menus, confirmation prompts, and object interaction in the main class |
| Organizing print logic | Moved bill-printing to a dedicated method inside the `Order` class |

---

## 👨‍💻 Author

Made with 💻 by **Youssef Amr**  
*First Year – College Project*

---

## 📄 License

This project is for educational purposes only.
