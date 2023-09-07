public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        boolean isEqual = num1 == num2;
        if (!isEqual){
            return false;
        }
        return true;

    }
}
