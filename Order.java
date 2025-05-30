import enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    List<OrderItem> items = new ArrayList<>();
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return moment.format(fmt2);
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void getItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(items.get(i));
        }
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem i : items) {
            sum += i.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order Summary:" +
                "\nOrder moment: " + getMoment() +
                "\nOrder status: " + getStatus() +
                "\nClient: " + getClient() +
                "\n|------------------------------------------------------------|";
    }
}
