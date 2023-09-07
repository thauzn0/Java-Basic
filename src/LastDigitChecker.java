public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){

        if (a > 1000 || a < 10 || b < 10 || b > 1000 || c < 10 || c > 1000){
            return false;
        }

        String str = Integer.toString(a);
        String str1 = Integer.toString(b);
        String str2 = Integer.toString(c);

        return (str.charAt(str.length() - 1) == str1.charAt(str1.length() - 1)) || (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) || (str.charAt(str.length() - 1) == str2.charAt(str2.length() - 1));

    }
    public static boolean isValid(int param){
        return param <= 1000 && param >= 10;
    }
}
