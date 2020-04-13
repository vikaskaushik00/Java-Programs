package vikdev.com;

public class Main {

    public static void main(String[] args) {

        int pw = 123456;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(123456);

        SomeClass someClass = new SomeClass(10);




    }
}
