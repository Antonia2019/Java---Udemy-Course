public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 24));
        System.out.println(hasSharedDigit(35, 24));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){

        if ( (firstNum >= 10 && firstNum <= 99) && (secondNum >= 10 && secondNum <= 99)){

            System.out.println("Is there any shared digit between " + firstNum + " and "+ secondNum + " ?");

            int firstNumLastDigit = firstNum % 10;
            firstNum /= 10;
            int secondNumLastDigit = secondNum % 10;
            secondNum /= 10;

            int firstNumFirstDigit = firstNum;
            int secondNumFirstDigit = secondNum;

            return ((firstNumFirstDigit == secondNumFirstDigit) || (firstNumFirstDigit == secondNumLastDigit)
                    || (firstNumLastDigit == secondNumFirstDigit) || (firstNumLastDigit == secondNumLastDigit));
        }
        System.out.println("Invalid input.");
        return false;

    }
}
