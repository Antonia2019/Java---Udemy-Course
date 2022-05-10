package  academy.learnprogramming;

public class Main {

    //String is a class, not a primitive
    public static void main(String[] args) {

        String myString = "Eu sunt";
        myString = myString + " \u00A9 Catalina!";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is " +lastString);
    }
}
