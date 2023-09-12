public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        if (number < 0){
            number *= -1;
        }

        String str = Integer.toString(number);
        int left = 0;
        int right = str.length() - 1;
        while ( left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return  true;
    }
}
