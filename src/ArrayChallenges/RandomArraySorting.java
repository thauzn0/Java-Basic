package ArrayChallenges;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static int[] getRandomArray(int length){
        Random random = new Random();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private static int[] sortInt(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < sortedArray.length; i++){
                if (sortedArray[i] < sortedArray[i+1] ){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] unsortedArr = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArr));
    }
}
