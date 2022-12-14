package hello.fundamental.classes.MethodParameters.ParamTest;

public class ParamTest {

    public static void main(String[] args) {
        /*
         * Test 1: Methods can't modify numeric parameters
         */

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test 2: Methods can change the state of object
         */

        System.out.println("\nTesting tripleSalary:");
        var harry = new Employee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary:" + harry.getName());

        /*
         * Test 3: Methods cant attach new objects to object
         */
        System.out.println("\nTesting swap");
        var j = new Employee("John", 50000);
        var d = new Employee("Doe", 60000);
        System.out.println("Before: j=" + j.getName());
        System.out.println("Before: d=" + d.getName());

        swap(j, d);
        System.out.println("After: j=" + j.getName());
        System.out.println("After: d=" + d.getName());
    }

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
