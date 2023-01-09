package hello.fundamental.classes.StaticFields_StaticMethods;

public class StaticMethods {
    public static void main(String[] args) {
        int n1 = Employee.advanceId();
        System.out.println("StaticMethods 1: " + n1);
        int n2 = Employee.advanceId();
        System.out.println("StaticMethods 2: " + n2);
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
