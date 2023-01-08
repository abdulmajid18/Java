package hello.fundamental.classes.StaticFields_StaticMethods;

public class StaticConstants {
    public static void main(String[] args) {
        System.out.println("StaticConstants:  " + Meth.PI);
    }

}

class Meth {
    int a;
    public static final double PI = 3.1415936558979223846;
}
