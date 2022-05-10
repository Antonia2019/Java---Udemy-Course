public class Switch {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);

        System.out.println();

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5.");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not 1, 2, 3, 4 or 5.");
                break;
        }

        char switchChar = 'B';

        switch (switchChar){
            case 'c':
                System.out.println("Value is c");
                break;
            case 'a': case 'b':
                System.out.println("Value is a or b");
                System.out.println("Actually it was " + switchChar);
                break;
            case 'd':
                System.out.println("Value is d");
                break;
            default:
                System.out.println("Was not a,b,c or d.");
                break;
        }

        String month = "JANuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("March");
                break;

            default:
                System.out.println("Not sure");
        }

    }

    public static void printDayOfTheWeek(int day){

            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("Invalid day");
                    break;
        }
    }
}
