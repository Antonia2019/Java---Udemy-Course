import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int min = 0;
        int max = 0;
        int counter = 0;
        boolean first = true;

        while (counter < 5){
//            System.out.println("Enter number:");
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max ){
                    max = number;
                }
                if (number < min){
                    min = number;
                }

//                min = Math.min(number);
//                max = Math.max(number);

            } else {
                break;
            }
            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("Min = " + min + " and Max = " + max);

        scanner.close();
    }
}
