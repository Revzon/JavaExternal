import entities.*;

import java.util.Arrays;

/**
 * Created by olga on 15.03.18.
 */
public class L2Task0Main {

    public static void main(String[] args) {
        createPolyArray();
    }

    private static void createPolyArray() {

        Point point = new Point(-1, 8);

        Figure[] myFigures = new Figure[1000000];
        int countFigures = -1;

        addToArray(myFigures, new Line(1, 2, 3, 4), ++countFigures);
        addToArray(myFigures, new Point(4, 1), ++countFigures);
        addToArray(myFigures, point, ++countFigures);
        addToArray(myFigures, new Line(new Point(6, 6), new Point(1, 6)), ++countFigures);
        addToArray(myFigures, new Triangle(new Point(6, 6), new Point(1, 6), new Point(6, 9)), ++countFigures);
        addToArray(myFigures, new Polygon(new Point[]{new Point(6, 6), new Point(1, 6), new Point(6, 9), new Point(6, -2), }), ++countFigures);

        myFigures = Arrays.copyOfRange(myFigures, 0, countFigures + 1);

        System.out.println("List of figures: ");
        for (int i = 0; i < myFigures.length; i++) {
            System.out.println(myFigures[i].toString());
        }
    }


    private static Figure[] addToArray(Figure[] figures, Figure figure, int countFigures) {

        figures[countFigures] = figure;
        return figures;

    }


}

