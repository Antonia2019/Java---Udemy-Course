package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int int2 = 5;
        // false, true, null

        //expressions
        double km = (100*1.609344);
               //this is an expressions

        int highScore = 50;
        if (highScore == 50){
            System.out.println("This is an expression");
        }

        //Statment
        int myVariable = 50; //int myVariable = 50; - the entaier line is a statment
        myVariable++;
        myVariable--;
        System.out.println("This is a test.");

        System.out.println("This is "+ "another" + " still more.");

        int secondScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        if(gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your second score was " + finalScore);
        }


    }
}
