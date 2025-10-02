package problem2;

public class Clothes extends Product {
	double discount;

    Clothes(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    double getFinalPrice() {
        return price - discount;
    }
}
