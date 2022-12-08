public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}

// Defining interface
interface Callback {
    void callback(int param);
}

// Implementiing interface methods
class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implements " +
                "may also define other members,  too.");
    }
}
