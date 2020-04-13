package PersonChallange;

public class Main {

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setFirstName("");
        obj.setLastName("");
        obj.setAge(10);
        System.out.println("Full name is : " +obj.getFullName());
        System.out.println("Teen : " +obj.isTeen());
        obj.setFirstName("vikas");
        obj.setAge(19);
        System.out.println("Full name is : "+obj.getFullName());
        System.out.println("Teen : " +obj.isTeen());
        obj.setLastName("Kaushik");
        System.out.println("Full name is : " + obj.getFullName());
    }
}
