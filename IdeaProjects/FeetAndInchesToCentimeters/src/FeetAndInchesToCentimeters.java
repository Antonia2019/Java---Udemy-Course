public class FeetAndInchesToCentimeters {

    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0 || inches > 12))) {
            System.out.println("Invalid feed or inches parameters");
            return -1;
        }

        double centimeters = (int) (feet * 12) * 2.54;
        centimeters += (int) inches * 2.45;
        System.out.println(feet + " feet " + inches + " inches " + " = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) { //method overloading (different parameters, the same name)

        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }




}
