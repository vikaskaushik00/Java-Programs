package vipCustomer;

public class vipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public vipCustomer(){
        this("vikas",1000,"vikas@gamil.com");
    }

    public vipCustomer(String name, int creditLimit){
        this(name,creditLimit,"kaushik@gmail.com");

    }
    public vipCustomer(String name , int creditLimit,String email){
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;

    }
    public String getName(){
        return this.name;
    }
    public int getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }
}
