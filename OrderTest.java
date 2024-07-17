public class OrderTest {
    /**
     * Main function to test the Order class with observers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an order with id 1
        Order order = new Order(1);

        // Create instances of PriceObserver and QuantityObserver
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        // Register the observers to the order
        order.addObserver(priceObserver);
        order.addObserver(quantityObserver);

        // Add items to the order and print the order status
        order.addItem(50);
        System.out.println("Order after adding one item:");
        System.out.println(order);

        order.addItem(160);
        System.out.println("Order after adding two items:");
        System.out.println(order);

        order.addItem(30);
        System.out.println("Order after adding three items:");
        System.out.println(order);

        order.addItem(10);
        System.out.println("Order after adding four items:");
        System.out.println(order);

        order.addItem(5);
        System.out.println("Order after adding five items:");
        System.out.println(order);
    }
}
