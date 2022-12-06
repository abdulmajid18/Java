public class scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }

// class LifeTime {
// public static void gh(String[] args) {
// int x;
// for (x = 0; x < 3; x++) {
// int y = -1; // y is initialized each time block is entered
// System.out.println("y is: " + y); // this always prints -1
// y = 100;
// System.out.println("y is now: " + y);
// }
// }
// }
// }
