/**
 * Created by olga on 15.03.18.
 */
public class Point extends Polygon{

    private int x;
    private int y;

    private Point() {

        super();
    }

    Point(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    public static int getX(Point p){
        return p.x;
    }

    public static int getY(Point p){
        return p.y;
    }

    public static void setX(Point p, int x){
        p.x = x;
    }

    public static void setY(Point p, int y){
        p.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
