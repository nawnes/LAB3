public class QuantityObserver implements OrderObserver {
    /**
     * This method is called by the observed object when it is changed.
     * It updates the shipping cost of the order based on the item count.
     * If the item count is greater than 5, the shipping cost is set to 0.
     * Otherwise, the default shipping cost of 10 is applied.
     *
     * @param order The order to be updated.
     */
    @Override
    public void update(Order order) {
        // Check if the item count exceeds the threshold
        if (order.getItemCount() > 5) {
            // Set the shipping cost to 0
            order.setShippingCost(0);
            // Print a message to the console indicating that the shipping cost has been set to 0
            System.out.println("QuantityObserver: Shipping cost set to $0.");
        } else {
            // Set the shipping cost to the default value
            order.setShippingCost(10);
            // Print a message to the console indicating that the default shipping cost has been applied
            System.out.println("QuantityObserver: Default shipping cost applied.");
        }
    }
}
