package hello.fundamental.classes.EmployeeTest;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Adams Smith", 5000, 1970, 1, 1);
        staff[1] = new Employee("John Smith", 10000, 1977, 2, 2);
        staff[2] = new Employee("John Doe", 4000, 1979, 3, 3);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("Name: " +
                    e.getName() + ", Salary: " + e.getSalary()
                    + ", HireDay: " + e.getHireDay());
        }
    }

}

class Employee {
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
