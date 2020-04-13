package mintuesAndSecondsChallange;

public class Main {
    public static final String Invalid_Message = "Invalid Input";
    public static void main(String[] args) {

        getDurationString(65,45);
        getDurationString(3945);

    }

    public static double getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            int hours = minutes / 60;
            int remMin = minutes % 60;
            System.out.println( hours + " hour " + remMin
            + " min " + seconds + " seconds");
            return 1;

        } else {
            System.out.println(Invalid_Message);
            return -1;
        }
    }

    public static double getDurationString(int second) {
        if(second >= 0) {
            int min = second / 60;
            int remSecond = second % 60;
            return getDurationString(min,remSecond);
        }
        else{
            System.out.println(Invalid_Message);
            return  -1;
        }
    }
}
