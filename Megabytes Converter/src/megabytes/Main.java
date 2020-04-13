package megabytes;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(10000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid input");
        else {
            int megaBytes = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(megaBytes + " Mb " + kb + "kb");
        }
    }
}
