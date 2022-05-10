public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1; //indicate an invalid value
        }
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return milesPerHour;

    }
    public static void printConvertion(double kilometersPerHour){
//        double milesPerHour = Math.round(0.62 * kilometersPerHour);
//        double milesPerHour = toMilesPerHour(37.33);
//        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }

}
