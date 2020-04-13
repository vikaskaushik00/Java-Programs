package method;

public class Main {

    public static void main(String[] args) {
       int highScore =  calculate(true,800,9,5);
        System.out.println("this is your final score : " + highScore);
        highScore = calculate(true,1000,10,20);
        System.out.println("This is final score : " + highScore);

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 20;
        int bonus = 30;
        highScore = calculate(gameOver,score,levelCompleted,bonus);
        System.out.println("This is final score : " + highScore);

    }
    public static int calculate( boolean gameOver, int score,int levelCompleted,int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }

    }
}
