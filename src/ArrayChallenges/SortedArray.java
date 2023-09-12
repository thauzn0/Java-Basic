package ArrayChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("\"Element %d contents %d\\n\", i, array[i]");
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int tmp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
