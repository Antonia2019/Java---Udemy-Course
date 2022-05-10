public class SecondsAndMinutes {

    private  static final String INVALID_VALUE_MESSAGE = "Invalid value"; // a constant that can't be changed

    public static void main(String[] args) {

        System.out.println(getDurationString(65,50));
        System.out.println(getDurationString(4743));
        System.out.println(getDurationString(-31));
    }

    private static String getDurationString(long minutes, long seconds){

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59) ) {
            long hours = minutes/60;
            long remainingMin = minutes%60;



            return hours + " h " + remainingMin + " min " + seconds + " sec";
        }
        return INVALID_VALUE_MESSAGE;
    }

    private static String getDurationString(long seconds){
        if (seconds >= 0 ) {
            long calcMin = seconds/60;
            long remainingSec = seconds%60;
            return getDurationString(calcMin, remainingSec);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
