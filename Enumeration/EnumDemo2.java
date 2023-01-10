package hello.Enumeration;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Here are apple constants:");

        // use values()
        Apple[] allapples = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);

        System.out.println();

        // use valueof()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap conatains " + ap);
    }

}

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}