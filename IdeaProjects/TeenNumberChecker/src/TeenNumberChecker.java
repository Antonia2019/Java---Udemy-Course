public class TeenNumberChecker {

    public static void main(String[] args) {

        hasTeen(9, 99, 19);
    }
    public static boolean hasTeen(int a, int b, int c){
        if( (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            System.out.println("We got a teen");
            return true;
        } else {
            System.out.println("No teen");
            return false;
        }
    }
}
