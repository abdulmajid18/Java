package hello.chapter_8.inheritance;

// This programuses inheritance to extend Box.

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.39);
        Box plainbox = new Box();

        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        // assign BoxWeight reference to Box reference
        plainbox = weightbox;

        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);

        /*
         * The following statement is invalid because plainbox
         * does not define a weight member.
         */
        // System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}

class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) { // pass object to constructor

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {

    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class ColourBox extends Box {
    int colour;

    ColourBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        colour = c;
    }
}
