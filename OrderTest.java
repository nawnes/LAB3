public class OrderTest {
/**
     * Main method to demonstrate the functionality of the Order class and its observers.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new order
        Order order = new Order(1);

        // Add observers to the order
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        RemoveItemObserver removeItemObserver = new RemoveItemObserver();

        order.addObserver(priceObserver);
        order.addObserver(quantityObserver);
        order.addObserver(removeItemObserver);

        // Add items to the order and observe updates
        order.addItem(50);
        System.out.println(order);

        order.addItem(160);
        System.out.println(order);

        order.addItem(30);
        System.out.println(order);

        order.addItem(10);
        System.out.println(order);

        order.addItem(5);
        System.out.println(order);

        // Remove items from the order and observe updates
        order.removeItem(30);
        System.out.println(order);

        order.removeItem(50);
        System.out.println(order);

        // Display the order summary
        order.displaySummary();
    }
}
