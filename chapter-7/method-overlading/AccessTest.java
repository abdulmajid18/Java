class AccessTest {
    public static void main(String[] args) {

        Test ob = new Test();

        // These are OK, a and b maybe accesse directly
        ob.a = 10;
        ob.b = 20;

        // This is not Ok, and will cause an error
        // ob.c = 100; // Error!

        // You must access c through it's methods
        ob.setc(100); // OK
        System.out.println("a,b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}

class Test {
    // Test Class implement setc and get
    int a;
    public int b;
    private int c;

    // methods to access c
    void setc(int i) {
        // set sets a variable c
        c = i;
    }

    int getc() {
        // returns variable c
        return c;
    }
}
