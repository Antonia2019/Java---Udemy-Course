public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if((barking && ( (hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23) ) ) ){
            return true;
        }
        else if ((!barking && hourOfDay < 8) || (!barking && hourOfDay > 22 )) {
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23 ) {
            return false;
        }
        return false;

    }
}