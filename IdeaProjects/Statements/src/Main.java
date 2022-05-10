public class Main {

    public static void main(String[] args) {

        int score = 50; // score = 50 is an expression
        if (score == 50) {
            System.out.println("This is an expression");
        }

        int myVar = 50; // the entire line is a statement
        myVar ++;
        System.out.println("This is a test");

        int score2 = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = score2 + (levelCompleted * bonus);
            System.out.println("your final score is " + finalScore);
        }
    }


}
