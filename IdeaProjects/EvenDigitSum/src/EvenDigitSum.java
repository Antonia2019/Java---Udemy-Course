public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println( getEvenDigitSum(1018));
    }

    public static int getEvenDigitSum(int number) {

        int sumOfEvenDigit = 0;
        int originalNumber = number;
        int lastDigit;

        if (number >= 0) {

            while (number > 0) {
                lastDigit = number % 10;
                if ((lastDigit % 2) == 0) {
                    sumOfEvenDigit += lastDigit;
                }
                number /= 10;
            }
            System.out.println("The sum of even digits within a number " + originalNumber + " is equal to:");
            return sumOfEvenDigit;
        }

        else {
            System.out.println("The input was invalid, since the program accepts only positive integers.");
        return -1;
    }
    }
}