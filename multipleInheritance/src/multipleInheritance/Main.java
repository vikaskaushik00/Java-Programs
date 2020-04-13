package multipleInheritance;

public class Main {

    public static void main(String[] args) {
	    sum obj = new sum();
	    obj.add();
	    i obj2 = new sum();
	    obj2.add();

    }
}

interface i{
   void add();
}
interface j{
     void add();
}
class sum implements i,j{
    public void add(){
        int a = 1;
        int b = 2;
        System.out.println((a+b)+" is the addition ");
    }
}
