package encapsulationPrinter;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(60,10,"Duplix");
        printer.fillToner(20);
        printer.page(5);
    }
}
