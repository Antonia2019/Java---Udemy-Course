public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(" " + isPerfectNumber(28));

    }

    public static boolean isPerfectNumber(int number){

        int sumOfProperDivisors = 0;

        if (number > 1){
            for (int i = 1; i < number; i++) {

                int perfectNumber = number % i;

                if (perfectNumber == 0){
                    sumOfProperDivisors += i;
                }
            }
            return sumOfProperDivisors == number;

        }
        return false;
    }
}
