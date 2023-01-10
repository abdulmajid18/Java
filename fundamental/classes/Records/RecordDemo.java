package hello.fundamental.classes.Records;

public class RecordDemo {

}

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        String result = String.format("Point[x=%d,y=%d]", x, y);
        return result;
    }
    // More methods ...
}
