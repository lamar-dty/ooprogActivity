package problem2;

public class Electronics extends Product {
	double warrantyFee;

    Electronics(String name, double price, double warrantyFee) {
        super(name, price);
        this.warrantyFee = warrantyFee;
    }

    double getFinalPrice() {
        return price + warrantyFee;
    }
}
