public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Handle negative numbers, you can choose your own error code or behavior.
        }

        // Convert the number to a string to easily access individual digits.
        String str = Integer.toString(number);

        // Check if the string has only one digit.
        if (str.length() == 1) {
            return 2 * Integer.parseInt(str); // Double the single digit to get the sum.
        }

        // Calculate the sum of the first and last digits.
        int firstDigit = Character.getNumericValue(str.charAt(0));
        int lastDigit = Character.getNumericValue(str.charAt(str.length() - 1));

        return firstDigit + lastDigit;
    }

}
