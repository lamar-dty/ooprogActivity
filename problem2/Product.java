package problem2;

public class Product {
	String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }
}
