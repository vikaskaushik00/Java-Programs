package NumberOfDays;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        getDaysInMonth(2, 2000);


    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else
                        return false;
                } else
                    return true;
            } else
                return false;
        } else
            return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 && month > 12) && (year < 1 && year < 9999)) {
            return -1;
        } else {
            boolean a = isLeapYear(year);
            if (a == true) {
                switch (month) {
                    case 1:
                        System.out.println("jan 31 days");
                        break;
                    case 2:
                        System.out.println("fab 29 days because it is leap year ");
                        break;
                    case 3:
                        System.out.println("march 31 days");
                        break;
                    case 4:
                        System.out.println("April 30 days");
                        break;
                    case 5:
                        System.out.println("May 31 days");
                        break;
                    case 6:
                        System.out.println("june 30 days");
                        break;
                    case 7:
                        System.out.println("july 31 days");
                        break;
                    case 8:
                        System.out.println("August 31 days");
                        break;
                    case 9:
                        System.out.println("September 30 days");
                        break;
                    case 10:
                        System.out.println("October 31 days");
                        break;
                    case 11:
                        System.out.println("November 30 days");
                        break;
                    case 12:
                        System.out.println("December 31 days");
                        break;
                    default:
                        System.out.println("wrong");
                        break;
                }
            } else {

                switch (month) {
                    case 1:
                        System.out.println("jan 31 days");
                        break;
                    case 2:
                        System.out.println("fab 28 days  ");
                        break;
                    case 3:
                        System.out.println("march 31 days");
                        break;
                    case 4:
                        System.out.println("April 30 days");
                        break;
                    case 5:
                        System.out.println("May 31 days");
                        break;
                    case 6:
                        System.out.println("june 30 days");
                        break;
                    case 7:
                        System.out.println("july 31 days");
                        break;
                    case 8:
                        System.out.println("August 31 days");
                        break;
                    case 9:
                        System.out.println("September 30 days");
                        break;
                    case 10:
                        System.out.println("October 31 days");
                        break;
                    case 11:
                        System.out.println("November 30 days");
                        break;
                    case 12:
                        System.out.println("December 31 days");
                        break;
                    default:
                        System.out.println("wrong");
                        break;

                }


            }
            return 1;
        }


    }
}
