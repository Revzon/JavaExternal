package entities;

/**
 * Created by olga on 15.03.18.
 */

public class Triangle extends Figure {

    private Line lineAB;
    private Line lineCB;
    private Line lineAC;

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
    }


    public Triangle(Point pointA, Point pointB, Point pointC) {
        super(3);
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

    }


    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(3);
        this.pointA = new Point(x1, y1);
        this.pointB = new Point(x2, y2);
        this.pointC = new Point(x3, y3);

    }


    public Point getPointA() {
        return pointA;
    }


    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }


    public Point getPointB() {
        return pointB;
    }


    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }


    public Point getPointC() {
        return pointC;
    }


    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    public Line getLineAB() {
        if (lineAB == null){
            return new Line(pointA, pointB);
        }
        return lineAB;
    }


    public Line getLineCB() {
        if (lineCB == null){
            return new Line(pointC, pointB);
        }
        return lineCB;
    }


    public Line getLineAC() {
        if (lineAC == null){
            return new Line(pointA, pointC);
        }
        return lineAC;
    }


    @Override
    public String toString() {
        return "Triangle{"  +
                "pointA = " + pointA +
                ", pointB = " + pointB +
                ", pointC = " + pointC +
                '}';
    }
}


