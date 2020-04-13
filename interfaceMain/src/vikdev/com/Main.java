package vikdev.com;

public class Main {

    public static void main(String[] args) {
        int num = 87787878;
        ITelophone myPhone = new DeskPhone(num);
        myPhone.power();
        myPhone.answer();
        myPhone.callPhone(num);
        myPhone.dial(num);
        myPhone.isRinging();

    }
}
