package hello.fundamental.classes.StaticFields_StaticMethods;

public class StaticField {
    public static void main(String[] args) {
        Employee harry = new Employee("harry");
        harry.use(harry);
        Employee mark = new Employee("mark");
        mark.use(mark);

    }
}

class Employee {
    private static int nextId = 0;
    private int id;
    String name;

    Employee(String name) {
        this.name = name;
    }

    void use(Employee e) {
        e.id = Employee.nextId;
        Employee.nextId++;
        System.out.println("Name of Employee: " + name);
        System.out.println("ID:  " + e.id);
        System.out.println("Next ID:  " + Employee.nextId);
    }
}
