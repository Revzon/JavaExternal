import java.util.Scanner;

/**
 * Created by olga on 11.03.18.
 */

public class Task0Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Task 0");

        System.out.print("Please insert number of rows ( > 1): ");
        int n = s.nextInt();
        System.out.print("Please insert number of columns ( > 1): ");
        int m = s.nextInt();

        if ((n < 2) || (m < 2)) {
            System.out.println("Impossible to build figures!");
            return;
        }

        System.out.println();

        createRectangle(n, m);
        createRightTriangle(n, m);
        createEquilateralTriangle(n, m);
        createRhomb(n, m);
    }


    private static void createRectangle(int n, int m){
        System.out.println("Rectangle");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if ( (i == 0)|| (j == 0) || (i == n - 1) || (j == m - 1) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

        System.out.println();

    }


    private static void createRightTriangle(int n, int m){
        System.out.println("Right triangle");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                if ( (j == 0)||(j == i)||(i == n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
        System.out.println();

    }


    private static void createEquilateralTriangle(int n, int m){
        System.out.println("Equilateral Triangle");
        int c = (int) Math.ceil( m / 2.0);

        if (c > n) {
            c = n;
        }

        m = 2 * c - 1;

        if ( m < 2) {
            System.out.println("Impossible to draw equilateral triangle! Space is not enough!");
            System.out.println();
            return;
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {

               System.out.print( (j == c - i - 1) ||(j == c + i - 1) || (i == c - 1) ? "*" : " " );

            }
            System.out.println();
        }
        System.out.println();

    }


    private static void createRhomb(int n, int m){
        System.out.println("Rhomb");
        n = (n < m) ? n : m;
        int c = (int) Math.ceil( n / 2.0);

        n = 2 * c - 1;

        if ( n < 3) {
            System.out.println("Impossible to draw rhomb! Space is not enough!");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < c) {
                    System.out.print( (j == c - i - 1 ) || (j == c + i - 1) ? "*" : " " );
                } else {
                    System.out.print( (j == c + i - n) || (j == c - i + n - 2) ? "*" : " " );
                }
            }
            System.out.println();
        }

        System.out.println();
    }

}
