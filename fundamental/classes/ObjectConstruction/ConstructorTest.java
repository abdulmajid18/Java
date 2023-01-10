package hello.fundamental.classes.ObjectConstruction;

import java.util.Random;

public class ConstructorTest {

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
