public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0)
            return -1;

        String str = Integer.toString(number);
        int sumOfEvens = 0;
        for (int i = 0; i < str.length() - 1 ; i++){

            if (str.charAt(i) % 2 == 0){
                sumOfEvens += str.charAt(i);
            }

        }
        return sumOfEvens;

    }
}
