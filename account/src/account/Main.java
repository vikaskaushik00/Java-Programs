package account;

public class Main {

    public static void main(String[] args) {

        bank info = new bank();
        System.out.println("Acccount number is : " +info.getAcNumber());
        System.out.println("Balance in account is : " + info.getBalance());
        System.out.println("Customer name is : " + info.getCustomerName());
        System.out.println("Email id : " + info.getEmail());
        System.out.println("Phone number : "+info.getPhoneNumber());
        info.deposit();
        info.withdraw();

    }
}
