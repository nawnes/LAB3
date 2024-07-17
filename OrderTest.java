public class OrderTest {
    /**
     * Main function to test the Order class and its observers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an order with ID 1
        Order order = new Order(1);

        // Add price and quantity observers to the order
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.addObserver(priceObserver); // Add price observer to the order
        order.addObserver(quantityObserver); // Add quantity observer to the order

        // Add items to the order and print the order after each addition
        order.addItem(50); // Add item with price 50
        System.out.println(order); // Print the order after the first addition

        order.addItem(160); // Add item with price 160
        System.out.println(order); // Print the order after the second addition

        order.addItem(30); // Add item with price 30
        System.out.println(order); // Print the order after the third addition

        order.addItem(10); // Add item with price 10
        System.out.println(order); // Print the order after the fourth addition

        order.addItem(5); // Add item with price 5
        System.out.println(order); // Print the order after the fifth addition
    }
}
