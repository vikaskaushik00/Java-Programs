package flourPack;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));

    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount = bigCount * 5;
        if(bigCount < 0 || smallCount < 0 || goal <0 )
            return false;
        else if(bigCount + smallCount >= goal){
                if(bigCount < goal) {
                    return true;
                }
                else return false;
            }
        else
            return false;

    }
}
