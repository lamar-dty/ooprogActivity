package problem3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter Name:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID:"));
        double basic = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary:"));

        Salary s = new Salary(name, id, basic);

        JOptionPane.showMessageDialog(null,
                "Name: " + s.name +
                "\nEmployee ID: " + s.empId +
                "\nBasic Salary: " + String.format("%.2f", s.basicSalary) +
                "\nHRA: " + String.format("%.2f", s.hra) +
                "\nTotal Salary: " + String.format("%.2f", s.getTotalSalary()));
    }
}
