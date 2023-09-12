public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        double miles  = kilometersPerHour / 1.609;
        long round = Math.round(miles);

        if (kilometersPerHour < 0)
            return -1;
        //1 km = 0.621371 miles

        return round;

    }

    public static void printConversion(double kilometersPerHour){
        double miles  = kilometersPerHour / 1.609;
        long round = Math.round(miles);

        if (kilometersPerHour < 0)
            System.out.print("Invalid Value");
        //1 km = 0.621371 miles
        System.out.print(kilometersPerHour + " km/h = " + round + "mi/h" );
    }

    public static void main(String[] args){
        System.out.print(toMilesPerHour(10.25));
        System.out.println(" ");

        printConversion(1.5);
        System.out.println(" ");
        printConversion(10.25);
    }
}
