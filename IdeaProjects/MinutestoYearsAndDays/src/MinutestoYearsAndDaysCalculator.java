public class MinutestoYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        long minutesInYear = 365*24*60;
        long year = minutes / minutesInYear;
        long days = (minutes/24/60) % 365;

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + year + " y "+ days + " d ");
        }
    }

}
