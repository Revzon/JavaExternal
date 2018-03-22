package entities;

/**
 * Created by olga on 15.03.18.
 */
public class Line extends Figure {

    private Point beg;
    private Point end;


    public Line(Point beg, Point end) {
        super(2);
        this.beg = beg;
        this.end = end;
    }


    public Line(int x1, int y1, int x2, int y2) {
        super(2);
        this.beg = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }


    public Point getBeg() {
        return beg;
    }


    public void setBeg(Point beg) {
        this.beg = beg;
    }


    public Point getEnd() {
        return end;
    }


    public void setEnd(Point end) {
        this.end = end;
    }


    @Override
    public String toString() {
        return "Line{" +
                "beg = " + beg +
                ", end = " + end +
                '}';
    }

}
