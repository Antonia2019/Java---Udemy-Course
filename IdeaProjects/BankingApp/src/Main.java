public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Banca Nationala Romana");

        bank.addBranch("Iasi");

        bank.addCustomer("Iasi","Antonia", 297.23);
        bank.addCustomer("Iasi","Alex", 972.23);
        bank.addCustomer("Iasi","Oana", 1075.372);

        bank.addBranch("Neamt");
        bank.addCustomer("Neamt", "Tatiana", 32663.13);

        bank.addCutomerTransation("Iasi", "Antonia", 323.31);
        bank.addCutomerTransation("Iasi", "Alex", 213.34);
        bank.addCutomerTransation("Iasi", "Oana", 23.35);

        bank.listCustomer("Iasi",true);
        bank.listCustomer("Neamt", true);
    }
}
