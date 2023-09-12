public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        if (number < 10) {
            System.out.println(digitWords[number]);
            return;
        }

        int lastDigit = number % 10;
        int firstDigit = number / 10;

        System.out.println(digitWords[firstDigit] + " " + digitWords[lastDigit]);
    }


    public static int reverse(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Parse the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr);

        return reversedNumber;
    }




    public static int getDigitCount(int number){
        String str = Integer.toString(number);
        return (int) (str.charAt(str.length()));
    }
}
