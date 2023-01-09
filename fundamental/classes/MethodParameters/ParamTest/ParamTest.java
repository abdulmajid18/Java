package hello.fundamental.classes.MethodParameters.ParamTest;

public class ParamTest {

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of Method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of Month: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;

        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());

    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
