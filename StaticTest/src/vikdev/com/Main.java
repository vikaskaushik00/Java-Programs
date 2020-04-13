package vikdev.com;

public class Main {

    public static void main(String[] args) {

    Static s = new Static(" 1st instance ");
    System.out.println(Static.getName() +" is "+Static.getNumInstance());

        Static t = new Static(" 2nd instance ");
        System.out.println(Static.getName() +" is "+Static.getNumInstance());

        Static j = new Static(" 3rd instance ");
        System.out.println(Static.getName() +" is "+Static.getNumInstance());
    }
}
