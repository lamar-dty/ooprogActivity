package problem1;

public class Manager extends Employee{
	double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double getSalary() {
        return baseSalary + bonus;
    }
}
