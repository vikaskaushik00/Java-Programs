package vikdev.com;

public class Main {

    public static void main(String[] args) {
    String privateVar = "this is private to main()";
    ScopeCheck scopeCheck = new ScopeCheck();
    System.out.println("scopeInstance private is "+scopeCheck.getPrivateVar());
    System.out.println(privateVar);
    scopeCheck.timesTwo();
    System.out.println("*******************************************");
    ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
    innerClass.timesTwo();

    }
}
