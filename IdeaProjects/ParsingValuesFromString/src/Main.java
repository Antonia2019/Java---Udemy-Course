public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125a";
        System.out.println("NumberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1; // concatenare -
        number +=1;

        System.out.println("NumberAsString = " + numberAsString);
        System.out.println("Number = " + number);


    }
}
