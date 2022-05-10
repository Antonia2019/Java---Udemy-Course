public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("NEW SCORE IS " + newScore); //METODA SUPRAINCARCATA
        calculateScore(75);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored, no player score.");
        return 0;
    }

}
