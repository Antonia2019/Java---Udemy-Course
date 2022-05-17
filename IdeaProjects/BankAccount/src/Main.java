public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("215765",4000,"Alex Ernila",
                "alex@gmail.com", "73626362");

        System.out.println("Customer name: "+bankAccount.getCustomerName());
        System.out.println("Account: " + bankAccount.getBalance());
        bankAccount.depositFunds(100);
        bankAccount.withdrawFunds(10.55);

        BankAccount cataAccount = new BankAccount("Cata", "cata@gmail.com", "0746781713");
        cataAccount.getCustomerName();
        cataAccount.getEmail();
        cataAccount.getPhoneNumber();
    }
}
