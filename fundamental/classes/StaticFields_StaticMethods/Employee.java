import java.time.LocalDate;

class Employee {
    String name;
    double salary;
    int year, month, day;
    LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, month);
    }

    public static void main(String[] args) {
        var e = new Employee("Romeo", 50000, 2003, 3, 31);
        System.out.println("Employee Name: " + e.name);
    }
}