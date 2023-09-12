public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int greatestCommonDivisor = 1; // Başlangıçta EBOB 1 olarak ayarlanır.

        int smallerNumber = Math.min(first, second);

        for (int i = 2; i <= smallerNumber; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
