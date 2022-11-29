class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //  assign valuesto mybox's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 5;
        mybox2.height = 10;
        mybox2.depth = 7;

        // display the volume of the first box
        mybox1.volume();
        // diisplay the volume for second box
        mybox2.volume();

    }
}
class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

