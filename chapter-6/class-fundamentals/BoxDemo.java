

class BoxDemo {
    public static void main(String[] argss) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume of the Box is " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;
}
