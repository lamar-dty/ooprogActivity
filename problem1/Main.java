package problem1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter employee name:");
        double baseSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter base salary:"));
        String isManager = JOptionPane.showInputDialog("Is the employee a manager? (yes/no):");

        isManager = isManager.toLowerCase();

        if (isManager.equals("yes")) {
            double bonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus:"));
            Manager m = new Manager(name, baseSalary, bonus);
            JOptionPane.showMessageDialog(null,
                    "Total Salary of Manager " + name + ": " + String.format("%.2f", m.getSalary()));
        } else {
            Employee e = new Employee(name, baseSalary);
            JOptionPane.showMessageDialog(null,
                    "Total Salary of Employee " + name + ": " + String.format("%.2f", e.getSalary()));
        }
	}
}
