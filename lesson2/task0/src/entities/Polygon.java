package entities;

import java.util.Arrays;

/**
 * Created by olga on 22.03.18.
 */
public class Polygon extends Figure {

    Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public Polygon(int n, Point[] points) {
        super(n);
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points = " + Arrays.toString(points) +
                '}';
    }
}
