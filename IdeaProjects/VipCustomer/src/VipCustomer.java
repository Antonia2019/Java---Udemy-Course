public class VipCustomer {

    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer() {
        this("default", 9000, "default address");
        System.out.println("1st Constructor");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name, creditLimit, "cata@gmail.com");
        System.out.println("2nd Constructor");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
