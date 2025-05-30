public class Product {
    private String name;
    private Double priceProduct;

    public Product(String name, Double priceProduct) {
        this.name = name;
        this.priceProduct = priceProduct;
    }

    public String getName() {
        return name;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }
}