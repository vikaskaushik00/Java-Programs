package vikdev.com;

public class Password {
    private static final int key = 767898898;
    private final int encryptedPassword;

    public Password(int password){
        this.encryptedPassword = encrypter(password);
    }

    public int encrypter(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as : "+this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if (encrypter(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Password Incorrect ");
            return false;
        }
    }

}
