package hello.fundamental.classes.StaticFields_StaticMethods;

public class StaticMethods {
    public static void main(String[] args) {
        int n = Employee.advanceId();
        System.out.println("StaticMethods: " + n);
    }
}

class Employee {
    private static int nextId = 0;
    private int id;

    public static int advanceId() {
        int r = nextId;
        nextId++;
        return r;
    }
}
