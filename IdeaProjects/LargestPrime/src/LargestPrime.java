public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));

    }

    public static int getLargestPrime(int number){

        if (number <= 1){ //if the nr is negative or does not have any prime numbers return -1 to indivate invalid value
            return -1;
        } else {
            int div = 2;
            while (number > div) {
                if (number % div != 0){
                    div++;
                }
                else {
                    number = number / div;
                    div = 2;
                }
            }
            return number;
        }
    }
}
