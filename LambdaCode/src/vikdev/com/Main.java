package vikdev.com;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
       final int c = 5;

        Add add = (int a, int b) -> {
        System.out.println("Your addition is : " + (a+b) + c);
        return 1;
        };
        Name name = (your) -> {
            System.out.println(your);
            for (int i = 1; i < 10; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        };

        main.run(5,5,add,name,"Vikas");

    }
    public void run(int a, int b,Add add,Name name,String stu){
        add.number(a,b);
        name.yourName(stu);

        System.out.println("Your execution has been completed");
    }


    interface Name {
        void yourName(String name);
    }

    interface Add {
        int number(int a, int b);
    }
}