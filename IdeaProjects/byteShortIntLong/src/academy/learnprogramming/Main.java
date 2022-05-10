package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); // underflow

        //PRIMITIVES DATA TYPES: BOOLEAN, BYTE, CHAR, short, float, int
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte Value = " + myMinByteValue);
        System.out.println("Max Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short Value = " + myMinShortValue);
        System.out.println("Max Short Value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long Value = " + myMinLongValue);
        System.out.println("Max Long Value = " + myMaxLongValue);

        byte myNewByteValue = (byte) (myMinByteValue/2); // casting to the correct data type
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue/2);

        byte myByte = 100;
        short myShort = 30000;
        int myInt = 30;

        long myLong = 50000L + 10L *(myByte + myShort + myInt);
        System.out.println("My long = "+ myLong);
    }
}
