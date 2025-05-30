public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        double sum = price * quantity;
        return sum;
    }

    @Override
    public String toString() {
        return product.getName() + ", " + price + ", Quantity: " + quantity + ", Subtotal: " + subTotal() + "\n";
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
