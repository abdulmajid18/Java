package hello.fundamental.classes.ObjectConstruction;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff)
            System.out.println("name= " + e.getName() +
                    " ,id= " + e.getId() + " ,salary=" + e.getSalary());
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    private static Random generator = new Random();

    // static initializaion
    static {
        // set nextId o a random number
        nextId = generator.nextInt(10000);
    }

    // object iniialization block
    {
        id = nextId;
        nextId++;
    }

    // Three Overloaded Constructors
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        // calls the employee(string, double) constructor
        this("Employee #" + nextId, s);
    }

    // default constructor
    public Employee() {
        // name ===> is set to ""
        // salary is initialized to 0
        // id is initialize tothe initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
