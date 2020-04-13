package vikdev.com;

public class Main {

    public static void main(String[] args) {

        Details details = new Details("Vikas","Java",12);
        Library library = new Library("Central Library");
        library.add(details);

        details = new Details("akash","python",12);
        library.add(details);


        details = new Details("ansh","ruby",12);
        library.add(details);

        details = new Details("sarthak","php",12);

        library.add(details);
        library.show();

    }
}
