package methodChallange;

public class Main {

    public static void main(String[] args) {
        int scorePostion = calculateHighScore(1500);
        displayHighScorePostion("Vikas", 1);
        scorePostion = calculateHighScore(900);
        displayHighScorePostion("John", 2);
        scorePostion = calculateHighScore(400);
        displayHighScorePostion("Nick", 3);
        scorePostion = calculateHighScore(50);
        displayHighScorePostion("kaylie", 4);

    }

    public static void displayHighScorePostion(String playerName, int scorePostion) {
            System.out.println(playerName + " managed to get into postion  " + scorePostion + " on the high score table ");
    }

    public static int calculateHighScore(int score) {
        if(score > 1000) {
            return 1;
        }
        else if (score >= 500 && score <= 1000){
            return 2;

        }
        else if (score > 100 && score < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
