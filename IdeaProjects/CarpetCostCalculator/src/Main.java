public class Main {

    public static void main(String[] args) {
        // write your code here
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Carpet(8.6);
        floor = new Floor(2, 14);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());

    }
}
