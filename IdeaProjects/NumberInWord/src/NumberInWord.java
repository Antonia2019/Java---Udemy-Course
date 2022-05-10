public class NumberInWord {

    public static void main(String[] args) {

        printNumber(1);
        printNumber(3);
        printNumber(8);
        printNumber(122);
    }

    public static void printNumber(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5: case 6: case 7: case 8:
                System.out.println("FIVE OR SIX OR SEVEN OR EIGHT");
                System.out.println("Actualy is " + number);
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }
}
