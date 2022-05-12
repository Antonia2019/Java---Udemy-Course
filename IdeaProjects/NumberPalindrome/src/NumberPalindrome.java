public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println( isPalindrome(121));
//        System.out.println( isPalindrome(-121));
//        System.out.println( isPalindrome(707));
//        System.out.println( isPalindrome(11212));
//        System.out.println( isPalindrome(111));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int temporaryNumber = number;

        while (number != 0) {
            int digit = number % 10;
            System.out.println("Last digit " + digit);
            reverse = reverse*10 + digit;
            System.out.println("Reverse " + reverse);
            number /= 10;
            System.out.println("Number " + number);
        }

        return reverse == temporaryNumber;
    }
}