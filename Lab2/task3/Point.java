package task3;

public class Point {
    private float x;
    private float y;

    Point() {
        this(0, 0);
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")\n";
    }
}
