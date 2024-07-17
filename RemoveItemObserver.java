public class RemoveItemObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("RemoveItemObserver: Item removed from order. Current item count: " + order.getItemCount());
    }
}
