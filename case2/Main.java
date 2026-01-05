package case2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create sample products
        Product p1 = new Product("P1", "Laptop", 85000, 5);
        Product p2 = new Product("P2", "Mouse", 1500, 20);
        Product p3 = new Product("P3", "Keyboard", 2500, 15);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        // Create customer
        Customer c = new Customer("C1", "Chhabi", "test@email.com", "12345");

        c.register();

        if (c.login("test@email.com", "12345")) {

            c.viewProducts(productList);

            c.addToCart(p1, 1);
            c.addToCart(p2, 2);

            c.getCart().viewCartItems();

            c.checkout();
        }
    }
}
