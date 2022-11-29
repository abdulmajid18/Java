class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        

        // display the volume of the first box
        vol = mybox1.volume(10,5,6);
        System.out.println("Volume is " + vol);

        // diisplay the volume for second box
        vol = mybox2.volume(8,4,5);
        System.out.println("Volume is " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    double volume(double w, double h, double d) {
        double vol;
        width = w;
        height = h;
        depth = d;

        vol = width * height * depth;
        return vol;
    }
}