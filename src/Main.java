public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        Product[] myCart = new Product[] {
                new Product("0.5L Fanta", 1.20, 1),
                new Product("Bread", 0.99, 3),
                new Product("1.5L Water", 0.74, 6),
                new Product("Turkey", 1.57, 2),
                new Product("Frozen Fries", 2.20, 1),
        };
        // setter example
        myCart[0].setName("50cl Fanta");
        // error handling: 0 => 1
        myCart[0].setQuantity(0);
        // error handling: -0.25 => 0.99
        myCart[1].setPrice(-0.25);
        System.out.println("Total Price: " + cashier.calculateTotal(myCart));
        cashier.generateTicket(myCart);
    }
}
