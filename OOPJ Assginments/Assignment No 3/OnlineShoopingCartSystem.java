/*
28. Online Shopping Cart System
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and
apply discounts.
Problem Statement:
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables
with getters/setters)
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic
behavior for cart items)
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice()
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can
have discounts applied)
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost
Sample Input:
Product1 → name="Laptop", price=50000
Product2 → name="Mouse", price=500
Product3 → name="Keyboard", price=1200
Sample Output:
Applying 10% discount to Laptop
Total Cart Price = 51800
*/

import java.util.ArrayList;
import java.util.List;

// Product class with encapsulation
class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Abstract class CartItem
abstract class CartItem {
    abstract double calculateTotalPrice();
}

// Interface Discountable
interface Discountable {
    void applyDiscount(double percentage);
}

// Cart class
class Cart extends CartItem {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 50000);
        Product product2 = new Product(2, "Mouse", 500);
        Product product3 = new Product(3, "Keyboard", 1200);

        // Create cart and add products
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Apply discount to one product (Laptop)
        Discountable discountableProduct = new Discountable() {
            @Override
            public void applyDiscount(double percentage) {
                double newPrice = product1.getPrice() * (1 - percentage / 100);
                product1.setPrice(newPrice);
            }
        };

        System.out.println("Applying 10% discount to " + product1.getName());
        discountableProduct.applyDiscount(10);

        // Display total cart price
        System.out.println("Total Cart Price = " + (int)cart.calculateTotalPrice());
    }
}
