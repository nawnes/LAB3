public class QuantityObserver implements OrderObserver {
    /**
     * Updates the order based on the quantity of items.
     * If the order has more than 5 items, the shipping cost is set to 0.
     * Otherwise, the default shipping cost of 10 is applied.
     * @param order the order to be updated
     */
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver: Shipping cost set to $0 for orders with more than 5 items.");
        } else {
            order.setShippingCost(10);
            System.out.println("QuantityObserver: Default shipping cost applied for orders with 5 items or less.");
        }
    }
}
