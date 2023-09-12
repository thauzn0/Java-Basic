public class ShareDigit {
    public static boolean hasSharedDigit(int a, int b){
        if ( (a > 99 || a < 10) || (b > 99 || b < 10 )){
            return false;
        }

        String str = Integer.toString(a);
        String str1 = Integer.toString(b);


        for (int i = 0; i <= str.length() - 1; i++){
            for(int j = 0; j <= str1.length() - 1 ;j++){

                if(str.charAt(i) == str1.charAt(j)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
       System.out.println(hasSharedDigit(155, 555)); // This should print true
       System.out.println(hasSharedDigit(15, 55));   // This should print true
       System.out.println(hasSharedDigit(12, 93));   // This should print false
       System.out.println(hasSharedDigit(16, 66));   // This should print true
    }

}
