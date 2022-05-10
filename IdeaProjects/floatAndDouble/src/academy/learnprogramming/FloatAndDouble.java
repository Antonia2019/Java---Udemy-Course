package academy.learnprogramming;


public class FloatAndDouble {
    public static void main(String[] args) {
        
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("My MIN FLOAT = " + myMinFloat);
        System.out.println("My Max FLOAT = " + myMaxFloat);
        
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("My MIN Double = " + myMinDouble);
        System.out.println("My Max Double = " + myMaxDouble);

        int myInt = 5/3;
        float myFloat = 5f/3f;
        double myDouble = 5d/3d;
        System.out.println("myINT = "+ myInt);
        System.out.println("myFLOAT = "+ myFloat);
        System.out.println("myDOUBLE = "+ myDouble);


        int nrOfPounds = 200;
        double kg = (double)0.45359237*nrOfPounds;
        System.out.println("Kg = " + kg);

        
    }
}
