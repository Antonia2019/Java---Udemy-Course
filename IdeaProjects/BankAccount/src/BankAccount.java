public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.5, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        double current = getBalance();
        setBalance(current + depositAmount);
        System.out.println("Deposit amount: " + depositAmount + " deposit. Your new balance is " + balance);
    }

    public void withdrawFunds(double withdrawsAmount){

        double current = getBalance();
        if (current < withdrawsAmount){
            System.out.println("Insufficient funds!");

        } else {
            setBalance(current - withdrawsAmount);
            System.out.println("Withdraws amount: " + withdrawsAmount + " withdraws. Remaining balance is " + balance);
        }
    }

}
