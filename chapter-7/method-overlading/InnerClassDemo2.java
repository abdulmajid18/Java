class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("display outer_x = " + outer_x);
        }
    }

    void showy() {
        System.out.println("") // Error since it's unknown ie out of scope of the outer class Doesn't even compiles
    }
}