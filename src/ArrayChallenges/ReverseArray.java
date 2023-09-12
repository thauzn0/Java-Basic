package ArrayChallenges;
import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        int first = 0; // index starts at 0
        int last = array.length-1; // index starts at 0 so length -1 for last index

        System.out.println("Array = " + Arrays.toString(array));
        while(last>first){ // loop until the half way mark of the array, i.e. values get inverted
            int temp = array[first]; // hold the first value of target
            array[first] = array[last]; // change first value of target with last value
            array[last] = temp; // replace last value of target with temp value
            first++; // increment further into the array
            last--; // decrement further into the array
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}