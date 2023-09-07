public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if (number < 1)
            return false;
        // 6 -> 6 / 1 = 0 tod = 1  + 2 + 3 + 6
        int totalOfDivisor = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                totalOfDivisor += i;
            }
        }

        return totalOfDivisor == number;
    }
}
