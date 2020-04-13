package barkingDog;

public class Main {

    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 15);
        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if (barking) {
            if ((hoursOfDay < 8 && hoursOfDay >= 0) || (hoursOfDay > 22 && hoursOfDay < 24)) {
                return true;
            } else
                return false;
        } else
            return false;
    }
}
