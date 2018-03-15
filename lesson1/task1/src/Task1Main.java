
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

        sortByFirstCriterion(arr);
        sortBySecondCriterion(arr);

    }



    private static int[] getArray(int k, Scanner s) {

        int choice;

        System.out.println();
        System.out.println("1. Input array");
        System.out.println("2. Generate array");


        while (true) {

            System.out.println("Your choice...");
            choice = s.nextInt();

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



    private static int[] insertArray(int k, Scanner s){

        int[] arr = new int[k];
        System.out.println("Please enter the elements: ");
        for (int i = 0; i < k; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }



    private static int[] generateArray(int k) {

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println("Generated array: ");
        printUnivariateArray(arr);

        return arr;
    }



    public static int[] bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] < arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }



    private static void sortByFirstCriterion(int[] arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (((arr[i] >= 0) && (arr[j] < 0))
                        || ((arr[i] >= 0) && (arr[j] >= 0) && (arr[i] < arr[j]))
                        || ((arr[i] < 0) && (arr[j] < 0) && (arr[i] > arr[j]))) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }

            }

        }

        System.out.println("First criterion:");

        printUnivariateArray(arr);
    }



    private static void sortBySecondCriterion(int[] arr){

        System.out.println("Second criterion:");
        printUnivariateArray(bubbleSort(arr));

    }



    private static void printUnivariateArray(int[]arr){

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + "  ");

       }
        System.out.println();

    }


}
