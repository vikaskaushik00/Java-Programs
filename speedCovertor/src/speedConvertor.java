
public class speedConvertor {
    public static long toMilesPerHour(double Kilometer) {
        if(Kilometer < 0) {
            return -1;
        }
        long  milesPerHour = (long) (Kilometer * 0.62137);
        long round = Math.round(milesPerHour);
        System.out.println("After changing " + Kilometer + " km into miles the result is "
        + round);
        return round;
    }
    public static void mileConversion (double Kilometer){
        if(Kilometer < 0)
            System.out.println("Invalid input");
        else {
            long rounded = toMilesPerHour(Kilometer);
            System.out.println(Kilometer + "km/h" + "=" + rounded + "mi/h");
        }
    }
}

