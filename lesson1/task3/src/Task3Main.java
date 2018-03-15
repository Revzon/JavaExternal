
import java.util.Scanner;

/**
 * Created by olga on 11.03.18.
 */

public class Task3Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Task 3");
        System.out.print("Please enter matrix size (n = 2*k + 1): ");
        int p = s.nextInt();

        int[][] matrix = getArray(p, p, s);

        printMatrixInHelix(matrix, p);

    }


    private static int[][] getArray(int n, int m, Scanner s) {

        int choice;

        System.out.println();
        System.out.println("1. Input array");
        System.out.println("2. Generate array");


        while (true) {

            System.out.println("Your choice...");
            choice = s.nextInt();

            switch (choice) {
                case (1):
                    return insertArray(n, m, s);

                case (2):
                    return generateArray(n, m);

                default:
                    System.out.println("There is no option #" + choice);
            }
        }

    }


    private static int[][] generateArray(int n, int m) {

        int[][] arr = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 10);

            }
        }

        System.out.println("Generated array: ");
        printFlatArray(arr);

        return arr;

    }


    private static int[][] insertArray(int n, int m, Scanner s){

        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();

            }

        }

        return arr;

    }


    private static void printMatrixInHelix(int[][] arr, int n){

        int lBorder = 0, rBorder = n - 1;
        int uBorder = 0, dBorder = n - 1;
        int amount = 0;

        System.out.println("Matrix in helix order:");
        while (amount != (n * n) -1){
            for (int j = lBorder; j < rBorder; j++) {
                System.out.print(arr[uBorder][j] + "  ");
                amount++;
            }

            for (int i = uBorder; i < dBorder; i++) {
                System.out.print(arr[i][rBorder] + "  ");
                amount++;
            }

            for (int j =rBorder; j > lBorder; j--) {
                System.out.print(arr[dBorder][j] + "  ");
                amount++;
            }


            for (int i = dBorder; i > uBorder; i--) {
                System.out.print(arr[i][lBorder] + "  ");
                amount++;
            }

            dBorder--;
            rBorder--;
            lBorder++;
            uBorder++;

        }

        System.out.println(arr[lBorder][uBorder] );

    }


    private static void printFlatArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");

            }

            System.out.println();
        }

        System.out.println();

    }


}
