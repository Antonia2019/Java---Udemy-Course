public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(33,123, 543));
        System.out.println(isValid(543));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){


        if ( (isValid(a)) && (isValid(b)) && (isValid(c)) ) {

            System.out.println("Do they share the last digit " + a + ", " + b + " and " + c + " ?");
            int firstNumLastDigit = a % 10;
            int secondNumLastDigit = b % 10;
            int thirdNumLastDigit = c % 10;


            return ((firstNumLastDigit == secondNumLastDigit) || (firstNumLastDigit == thirdNumLastDigit)
                    || (secondNumLastDigit == thirdNumLastDigit));
        }

        return false;
    }

    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }
}
