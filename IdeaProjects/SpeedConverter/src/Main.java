public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConvertion(23.232);

        long miles = SpeedConverter.toMilesPerHour(23.232);
        System.out.println("Miles = " + miles);

    }
}
