package case2;

/**
 * Represents a product in the e-commerce system.
 */
public class Product {

    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Displays product details.
     */
    public void getDetails() {
        System.out.println(productId + " | " + name + " | Rs." + price + " | Stock: " + stockQuantity);
    }

    /**
     * Checks whether the required quantity is available.
     */
    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
