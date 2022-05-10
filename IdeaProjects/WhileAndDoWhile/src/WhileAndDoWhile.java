public class WhileAndDoWhile {

    public static void main(String[] args) {

        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value " + count);
//            count++;
//        }

//        for (int i = 1; i < 7; i++){
//            System.out.println("Count value is "+ count);
//        }
        count = 4;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);
    }
}
