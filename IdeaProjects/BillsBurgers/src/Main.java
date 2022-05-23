public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.addHamburgerAddition4("Potatos", 0.15);
        price = hamburger.itemizedHamburger();
        System.out.println("Total burger price is: " + price);


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healty Burger price is " + healthyBurger.itemizedHamburger());


        DeluxeBurger db = new DeluxeBurger();
        price = db.itemizedHamburger();
        System.out.println("Total deluxe burger price is " + price);
    }
}
