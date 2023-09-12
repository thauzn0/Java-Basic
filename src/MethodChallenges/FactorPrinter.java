public class FactorPrinter {
    public static void printFactors(int number){
        if (number < 1)
            System.out.println("Invalid Value");
        // 6
        for (int i = 1; i <= number; i++){
            if(number == 1 ){
                System.out.println(i);
            }

            else if(number % i == 0){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args){

    }
}
