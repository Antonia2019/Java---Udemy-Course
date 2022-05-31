import java.util.ArrayList;

public class Bank {


    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCutomerTransation(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransation(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i<this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }


    public boolean listCustomer(String branchName, boolean showTransations){
        Branch branch = findBranch(branchName);
        if (branchName != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransations){
                    System.out.println("Transations");
                    ArrayList<Double> transations = branchCustomer.getTransactions();
                    for (int j=0; j<transations.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transations.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
