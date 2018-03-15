import java.util.ArrayList;

/**
 * Created by olga on 15.03.18.
 */
public class L2Task0Main {

    public static void main(String[] args){
        createPolyArray();
    }

    private static void createPolyArray() {
        Point point = new Point(-1, 8);
        ArrayList <Polygon> myPolygons = new ArrayList<Polygon>();
        myPolygons.add(0, new Line(1, 2, 3, 4));
        myPolygons.add(1, new Point(4, 1));
        myPolygons.add(2, point);
        myPolygons.add(3, new Line(new Point(6, 6), new Point(1, 6)));
        myPolygons.add(4, new Triangle(new Point(6, 6), new Point(1, 6), new Point(6, 9)));
        for (int i = 0; i < myPolygons.size(); i++) {
            System.out.println(myPolygons.get(i).toString());
        }
    }

}
