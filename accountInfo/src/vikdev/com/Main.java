package vikdev.com;

public class Main {

    public static void main(String[] args) {
        Account obj = new Account(1234,5000,84331037,"Vikas kaushik ","vikaskaushik007@gmail.com");
        System.out.println(obj.getBalance());
        obj.addFund(1000);
        obj.withdraw(5500);

    }
}
