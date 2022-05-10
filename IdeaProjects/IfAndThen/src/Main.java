public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("I am afraid.");

            //logical or operator
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){ //&& (AND operator)
            System.out.println("Greater then second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){ //  || (OR operator)
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen.");
        }

        // ternery operator value and type
        boolean wasCar = isCar? true:false;

        int ageOfClient = 20;
        boolean isTwenty = ageOfClient == 20? true:false; // ?: ternary operator if-than else
        if (isTwenty){
            System.out.println("The client is 20.");
        }

        double myValue = 20.00;
        double secondValue = 80.00;
        double totalValue = (myValue + secondValue)*100.00;
        System.out.println("Total value "+ totalValue);
        double remainder = totalValue%40.00;
        System.out.println("The REMAIDER "+ remainder);

        boolean isNoRemaider = remainder == 0? true:false;
        System.out.println("isNoRemaider = " + isNoRemaider);
        if (!isNoRemaider){
//            System.out.println("The remainder is 0");
            System.out.println("Got some remaider.");
        }
    }

}
