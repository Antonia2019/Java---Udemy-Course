public class SumOddRange {

    public static void main(String[] args) {

        System.out.println("The sum of the odd numers = " + sumOdd(5,10));

    }
    public static boolean isOdd(int number){
        return number > 0 && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                    System.out.println("Odd nr = " + i);
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}