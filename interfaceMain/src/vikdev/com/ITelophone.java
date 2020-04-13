package vikdev.com;

public interface ITelophone {

    void power();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
