
import java.util.Scanner;

/**
 * Created by olga on 11.03.18.
 */

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println("Task 2");
        System.out.print("Please enter number of rows: ");
        int n = s.nextInt();
        System.out.print("Please enter number of columns: ");
        int m = s.nextInt();

        int[][] arr2 = getArray(n, m, s);
        int[][] arr3 = cloneArray(arr2);

        sortByThirdCriterion(arr2);
        sortByFourthCriterion(arr3);

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




    private static int[][] insertArray(int n, int m, Scanner s) {

        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();

            }
        }

        return arr;

    }


    public static int[][] cloneArray(int[][] firstArr) {

        int length = firstArr.length;
        int[][] newArr = new int[length][firstArr[0].length];

        for (int i = 0; i < length; i++) {
            System.arraycopy(firstArr[i], 0, newArr[i], 0, firstArr[i].length);
        }

        return newArr;
    }


    private static void sortByThirdCriterion(int[][] arr) {

        double[] avArray = new double[arr[0].length];
        double eps = 0.00001;
        int buff;


        for (int j = 0; j < arr[0].length; j++) {

            for (int[] anArr : arr) {
                avArray[j] += anArr[j];
                avArray[j] /= arr.length;

            }

        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int k = 0; k < avArray.length - 1; k++) {

                if (avArray[k] - avArray[k + 1] < eps) {
                    double tmp = avArray[k];
                    avArray[k] = avArray[k + 1];
                    avArray[k + 1] = tmp;

                    for (int i = 0; i < arr.length; i++) {
                        buff = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = buff;
                    }

                    flag = true;

                }

            }

        }

        System.out.println("Third criterion");
        System.out.println("Array sorted in descending order by the average of the columns");

        printFlatArray(arr);
    }


    private static void sortByFourthCriterion(int[][] arr) {
        int[] sequenceArray = new int[arr.length];
        int buff;
        for (int i = 0; i < arr.length; i++) {
            sequenceArray[i] = findTheLongestSequence(arr[i]);

        }

        boolean flag = true;
        while (flag) {
            flag = false;

            for (int k = 0; k < sequenceArray.length - 1; k++) {

                if (sequenceArray[k] > sequenceArray[k + 1]) {
                    buff = sequenceArray[k];
                    sequenceArray[k] = sequenceArray[k + 1];
                    sequenceArray[k + 1] = buff;

                    for (int j = 0; j < arr[0].length; j++) {
                        buff = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = buff;
                    }

                    flag = true;

                }

            }

        }

        System.out.println("Fourth criterion");
        System.out.println("Array sorted in increasing order by length of the similar numbers sequences in a row");
        printFlatArray(arr);

    }


    private static int findTheLongestSequence(int[] arr) {
        int num = 1;
        int maxSequence = 1;
        int comparedElement = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == comparedElement) {
                num++;
            } else {
                comparedElement = arr[i];
                num = 1;
            }

            if (maxSequence < num) {
                maxSequence = num;
            }
        }

        return maxSequence;
    }


    private static void printFlatArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.println();
    }



}
