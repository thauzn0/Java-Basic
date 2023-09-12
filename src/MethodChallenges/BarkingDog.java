public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 24) && (hourOfDay < 0 ))
            return false;
        if (barking){
            if(hourOfDay < 8 || (hourOfDay > 22 && hourOfDay <= 24)){
                return true;
            }
            return false;
        }
        return false;

    }
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 44));

    }
}
