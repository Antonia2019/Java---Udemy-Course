public class TheForStatement {

    public static void main(String[] args) {

    //for (init (a var); condition; increment)

        for (int i = 0; i < 9; i++){
            System.out.println("10,000 at " + i +  "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("***********************");

        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i +  "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int a = 100; a > 3; a--){
            if (isPrime(a)) {
                count++;
                System.out.println("The number " + a + " is prime.");
                if (count == 10){
                    System.out.println("Existing for loop");
                    break;
                }

            }
        }

        int sum = 0;
        int count2 = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                count2++; //1 , 2, 3 ...5
                sum += i; // 15 45, 60 ...75
                System.out.println("The number " + i + " is divided be 3 and 5.");
            }
            if (count2 == 5){
                break;
            }
        }
        System.out.println("The sum is: " + (sum));


    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
//            System.out.println("Loping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true; //is a prime number
    }


}
