public class PriceObserver implements OrderObserver {
    /**
     * Applies a discount of $20 to orders with a total item cost over $200.
     *
     * @param order the order to be updated.
     */
    @Override
    public void update(Order order) {
        if (order.getItemCost() > 200) {
            // Calculate the discount
            double discount = 20;
            // Apply the discount
            order.setItemCost(order.getItemCost() - discount);
            // Print a message to the console indicating that the discount was applied
            System.out.println("PriceObserver: Discount of $" + discount + " applied.");
        } else {
            // Print a message to the console indicating that the discount was not applied
            System.out.println("PriceObserver: No discount applied.");
        }
    }

}
