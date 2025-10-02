package problem3;

public class Salary extends Employee {
	double basicSalary;
    double hra;
    Salary(String name, int empId, double basicSalary) {
        super(name, empId);
        this.basicSalary = basicSalary;
        this.hra = 0.2 * basicSalary;
    }

    double getTotalSalary() {
        return basicSalary + hra;
    }
}
