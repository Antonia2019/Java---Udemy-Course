public class Main {

    public static void main(String[] args) {
        ITelephone catasPhone;
        catasPhone = new DeskPhone(12345);
        catasPhone.powerOn();
        catasPhone.callPhone(12345);
        catasPhone.answer();

        catasPhone = new MobilePhone(23444);
        catasPhone.powerOn();
        catasPhone.callPhone(23444);
        catasPhone.answer();
    }
}
