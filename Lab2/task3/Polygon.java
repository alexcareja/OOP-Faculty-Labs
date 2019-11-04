package task3;

import java.util.ArrayList;

public class Polygon {
    private int n;
    private Point[] p;
    //ArrayList<Point> points= new ArrayList<Point>;

    Polygon(int n) {
        this.n = n;
        this.p = new Point[n];
    }

    Polygon(int[] coords) {
        this(coords.length / 2);
        int i = 0;
        while (i < coords.length) {
            //points.add(new Point(coords[i], coords[i+1]));
            p[i / 2] = new Point(coords[i], coords[i + 1]);
            i += 2;
        }
    }

    void showCoords() {
        int i = 0;
        while (i < this.n) {
            System.out.println(p[i]);
            i += 1;
        }

        for (int j = 0; j < p.length; j++) {

        }
    }
}
