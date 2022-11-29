class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        //  assign valuesto mybox's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 5;
        mybox2.height = 10;
        mybox2.depth = 7;

        // display the volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // diisplay the volume for second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}