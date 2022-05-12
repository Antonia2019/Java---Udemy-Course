public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30));

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first >= 10 && second >= 10){

            // finds the greater number of the two given and then ascribes that value to int greaterNumber
            int greaterNumber = Math.max(first, second);

            // iterates by gcd and checks if modulo operations by it are equal to 0
            int gcd;
            for (gcd = greaterNumber; gcd > 0; gcd--){
                if ( (first % gcd == 0) && (second % gcd == 0) ){
                    return gcd;
                }
            }
        }
        //otherwise
        // return false (-1)
        return -1;
    }
}
