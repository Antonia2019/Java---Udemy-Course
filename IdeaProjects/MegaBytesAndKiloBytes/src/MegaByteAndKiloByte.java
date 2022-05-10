public class MegaByteAndKiloByte {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            int megaByte = kiloBytes/1024;
            int remainingKiloBytes = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " +
                    megaByte + " MB AND " +
                    remainingKiloBytes + " KB");
        }

    }
}
