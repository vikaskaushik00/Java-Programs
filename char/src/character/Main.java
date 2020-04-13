package character;

public class Main {

    public static void main(String[] args) {
	 char myChar = 'E';
	 char myUnicode = '\u0045';
	 System.out.println(myUnicode);
	 System.out.println(myChar);

	 String myString = "I am vikas \u00A9 2019";
	 myString = myString + "  I am pursuing btech in sharda university";
	 System.out.println(myString);
	 String lastString = "20";
	 int num = 50;
	 lastString = lastString + num;
	 System.out.println(lastString);

    }
}
