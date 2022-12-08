public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }

}

// A nested interface example

// This class conains a member interface

class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}