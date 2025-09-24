public class Product {
    private int quantity;
    private double price;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price > 0 ? price : 0.99;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 1;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
