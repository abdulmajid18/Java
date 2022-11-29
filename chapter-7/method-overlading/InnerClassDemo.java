class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        outer.test_2();
    }
}

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    void test_2() {
        Inner inner = new Inner();
        System.out.println("Inner class variable " + inner.hide);
    }

    class Inner {
        int hide = 2;
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}