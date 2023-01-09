package hello.fundamental.classes.StaticFields_StaticMethods;

public class StaticTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 50000);
        staff[2] = new Employee("Harry", 60000);

        for (Employee e : staff) {
            System.out.println("name " + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next Avialable id=" + n);
    }
}

class Employee {
    private static int nextID = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int advanceId() {
        int r = nextID;
        nextID++;
        return r;
    }

    public static int getNextId() {
        return nextID;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        var e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
