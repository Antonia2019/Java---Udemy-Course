public class EvenNumber {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(24067));

        int number = 0;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        // while (condition){}

        // do {
              // statement
        // } while (condition);

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                    continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even number " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        return (number % 2) == 0;
    }
}
