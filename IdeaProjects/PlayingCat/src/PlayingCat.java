public class PlayingCat {

    public static void main(String[] args) {
        System.out.println("Is the cat playing? " + isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if ( ((temperature >= 25 && temperature <= 35) && summer) ||
                (temperature >= 25 && temperature <= 35) && !summer )
            return true;
        return false;
    }
}
