package vikdev.com;

public class Palindrome {
    private String string,b="";
    public Palindrome(String string){
        this.string = string.toUpperCase();
    }
    public void palindrome(){
    for (int i = string.length()-1;i >= 0;i--){
        b = b + string.charAt(i);

    }
    if (string.equals(b)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not palindrome");
    }
    }
}
