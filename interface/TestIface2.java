public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}

// Defining interface
interface Callback {
    void callback(int param);
}
// Another implementation

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("ANother version of callback");
        System.out.println("p squared is  " + (p * p));
    }
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implements " +
                "may also define other members,  too.");
    }
}
