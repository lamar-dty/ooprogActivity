package problem2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Enter product name:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
        String type = JOptionPane.showInputDialog("Enter product type (electronics/clothes):");
        type = type.toLowerCase();

        if (type.equals("electronics")) {
            double warrantyFee = Double.parseDouble(JOptionPane.showInputDialog("Enter warranty fee:"));
            Electronics e = new Electronics(productName, price, warrantyFee);
            JOptionPane.showMessageDialog(null,
                    "Final price of electronic: " + String.format("%.2f", e.getFinalPrice()));
        } else if (type.equals("clothes")) {
            double discount = Double.parseDouble(JOptionPane.showInputDialog("Enter discount:"));
            Clothes c = new Clothes(productName, price, discount);
            JOptionPane.showMessageDialog(null,
                    "Final price of clothes: " + String.format("%.2f", c.getFinalPrice()));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid product type!");
        }
	}
}
