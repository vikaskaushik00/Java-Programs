package encapsulationPrinter;

public class Printer {
    private int tonerLevel;
    private int noPage;
    private String typePrinter;

    public Printer(int tonerLevel, int noPage, String typePrinter){
        if(tonerLevel <= 100 && tonerLevel > 0){
            this.tonerLevel = tonerLevel;
        }
        this.noPage = noPage;
        this.typePrinter  = typePrinter;
    }

    public void fillToner(int ink){
        this.tonerLevel = tonerLevel + ink;
        if(this.tonerLevel > 0 && this.tonerLevel <= 100 ) {
            System.out.println("Toner level is " + tonerLevel + "%");
        }
        else
            System.out.println("Wrong filling input ");
    }
    public void page(int noPage){
        this.noPage = this.noPage + noPage;
        System.out.println("Current number of pages : "+noPage);
        System.out.println("Total pages : "+this.noPage);
    }
    public int getTonerLevel(){
        return this.tonerLevel;
    }
    public int getNoPage(){
        return this.noPage;
    }
    public String getTypePrinter(){
        return this.typePrinter;
    }


}
