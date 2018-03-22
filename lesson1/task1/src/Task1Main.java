
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by olga on 11.03.18.
 */


public class Task1Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.print("Please enter array length: ");
        int k = s.nextInt();

        int[] arr = getArray(k, s);
        int[] arr1 = arr.clone();

        sortByFirstCriterion(arr);
        sortBySecondCriterion(arr1);

    }


    private static int[] getArray(int k, Scanner s) {

        System.out.println();
        System.out.println("1. Input array");
        System.out.println("2. Generate array");


        while (true) {

            System.out.println("Your choice...");
            int choice = s.nextInt();

            switch (choice) {
                case (1):
                    return insertArray(k, s);

                case (2):
                    return generateArray(k);

                default:
                    System.out.println("There is no option #" + choice);
            }
        }

    }


    private static int[] insertArray(int k, Scanner s) {
        int[] arr = new int[k];
        System.out.println("Please enter the elements: ");
        for (int i = 0; i < k; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }


    private static int[] generateArray(int k) {

        int[] arr = new int[k];

        Random rand = new Random();


        for (int i = 0; i < k; i++) {
            arr[i] = rand.nextInt(201) - 100;
        }

        System.out.println("Generated array: ");
        System.out.println(Arrays.toString(arr));

        return arr;
    }


    private static void sortByFirstCriterion(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (((arr[i] >= 0) && (arr[j] < 0))
                        || ((arr[i] >= 0) && (arr[j] >= 0) && (arr[i] < arr[j]))
                        || ((arr[i] < 0) && (arr[j] < 0) && (arr[i] > arr[j]))) {

                    swap(arr, i, j);
                }

            }

        }

        System.out.println("First criterion:");
        System.out.println(Arrays.toString(arr));
    }


    private static void sortBySecondCriterion(int[] arr) {

        int j = arr.length - 1;
        int i = 0;

        while (i < j) {

            if (arr[i] < 0) {

                while ((arr[j] < 0) && (j > i)) {
                    j--;
                }

                swap(arr, i, j);
            }

            i++;
        }

        System.out.println("Second criterion:");
        System.out.println(Arrays.toString(arr));

    }


    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
