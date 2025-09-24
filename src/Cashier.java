public class Cashier {
    private final char currency = '€';
    public double calculateTotal(Product[] products) {
        double total = 0;
        for(Product product : products) {
            total += (product.getPrice() * product.getQuantity());
        }
        return total;
    }
    public void generateTicket(Product[] products) {
        System.out.println("-------------- TICKET GENERATED --------------");
        System.out.printf("%-15s %-9s %s\n", "Product", "Price", "Quantity");
        for (Product product : products) {
            System.out.printf("%-15s %.2f%-5c %d\n", product.getName(), product.getPrice(), currency, product.getQuantity());
        }
        System.out.println("\nTotal: " + calculateTotal(products) + currency);
        System.out.println("------- THANK YOU FOR SHOPPING WITH US -------");
    }
}
