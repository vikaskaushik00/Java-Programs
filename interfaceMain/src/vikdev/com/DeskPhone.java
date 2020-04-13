package vikdev.com;

public class DeskPhone implements ITelophone{

    private int phoneNumber;
    private boolean myNumber;

    public DeskPhone(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void power(){
        System.out.println("DeskPhone doesn't have power button ");
    }
    @Override
    public void dial(int phoneNumber){
        System.out.println("Dialed number "+phoneNumber);
        myNumber = true;
    }

    @Override
    public void answer(){
        if (myNumber){
            System.out.println("Answer the call ");
        }else
            System.out.println("Don't answer the call");
    }

    @Override
    public boolean callPhone(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
        return true;
    }

    @Override
    public boolean isRinging(){
        System.out.println("Phone is ringing ");
        return true;
    }
}
