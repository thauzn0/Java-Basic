package ArrayChallenges;

import java.util.Scanner;

public class MinimumElement {
    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, seperated by commas:");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());

        }
        return values;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int el : arr){
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}
