public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800; // score = 50 is an expression
        int levelCompleted = 5;
        int bonus = 100;

       int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);


//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }



        score = 10000;  // the entire line is a statement
        levelCompleted = 8;
        bonus = 200;
        int highScoreSecond = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your final score game 2 was: " + highScoreSecond);

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighPosition("ALEX", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighPosition("Cata", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighPosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighPosition("Gerald", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800; // score = 50 is an expression  ///  !!!! we don't need to create this variables again
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;

    }

    public static void displayHighPosition(String playerName, int highScoreTable){

        System.out.println(playerName +" managed to get into position "
                + highScoreTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        }
//        else if (playerScore >= 500) {
//            return 2;
//        }
//        else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

        int positon = 4;

        if (playerScore >= 1000){
            positon = 1;
        } else if (playerScore >= 500){
            positon = 2;
        } else if (playerScore >= 100){
            positon = 3;
        }
        return positon;
    }

}
