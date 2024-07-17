import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private List<OrderObserver> observers;

    public Order(int id) {
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0.0;
        this.shippingCost = 10.0; // Coût d'expédition par défaut
        this.observers = new ArrayList<>();
    }

    public void addItem(double price) {
        itemCount++;
        itemCost += price;
        notifyObservers();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemCount=" + itemCount +
                ", itemCost=" + itemCost +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
