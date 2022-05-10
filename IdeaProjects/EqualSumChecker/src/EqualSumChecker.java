public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(3,3,9);
    }
    public static boolean hasEqualSum(int one, int two, int three){
        int sum = one + two;
        if(sum == three){
            System.out.println("The sum of the 1st and 2nd parameter is equal to the 3rd parameter.");
            return true;
        } else {
            System.out.println("The sum is not equal.");
            return false;

        }
    }
}
