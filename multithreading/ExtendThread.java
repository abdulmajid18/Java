package hello.multithreading;

public class ExtendThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");

    }
}

// create a second thread by extending Thread
class NewThread extends Thread {
    NewThread() {
        // create a new, second thread
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
