package vipCustomer;

public class Main {

    public static void main(String[] args) {

        vipCustomer obj = new vipCustomer();
        vipCustomer person2 = new vipCustomer("raju",1200);
        System.out.println(obj.getName());
        System.out.println(obj.getCreditLimit());
        System.out.println(obj.getEmail());
        System.out.println(person2.getName());

    }
}
