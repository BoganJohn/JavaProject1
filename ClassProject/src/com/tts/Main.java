package com.tts;

import java.util.Scanner;

public class Main {

    private static boolean sum;

    public static void main(String[] args) {
        // System.out.println("One Line");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = input.nextLine();
        // System.out.printf("Hello %s!\n", firstName);
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("Your entire name is: %s %s.\n", firstName, lastName);

//        char answer = 'Y';             // 'Y' as the explicit character value
//        char middleInitialC = 0x0043;  // 'C'as a hexidecimal
//        char lowerCaseA = \u0061;      // 'a' as a unicode
//        char capitalK = 75;            // 'K' as an integer value

        long BigLong = 230L;          // long (l, L)
        float SomeFloat = 927.42f;    // float (f, F)
        double someDbl = 392.2d;      // double (d, D)
        double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0

        byte b = (byte) 2321;

        int smallInt = 120;   //int is 4 bytes
        int biggerInt = 550;  //int is 4 bytes

//downcasting 4 bytes into 1 byte
        byte b1= (byte)smallInt;  //value in both will be 120
        byte b2= (byte)biggerInt; //value out of range, will be truncated

//downcasting 4 bytes into 2 bytes
        short s1= (short)biggerInt;   //value in range, no truncation

//        int x = 5;
//        int y = 10;
//        int z = 11;
//
//        int x = 5;
//        int y = 10;
//        int z = 11;

        if (sum > 13 && sum < 26) {
            System.out.println("Right in the sweet spot.");
        } else {
            System.out.println("Too little, too much.");
        }


// when comparing strings remember to use equals() method
        if (choice.equals("cash") || choice.equals("credit")) {
            System.out.println("Thanks for shopping at our store.");
        } else {
            System.out.println("Sorry, we don't accept checks.");

            class ScopeExamples
            {
                // a class-level variable
                int aClassVaraible = 0;

                public void methodOne()
                {
                    // a method-level variable - accessible anywhere in methodOne()
                    int outer = 0;

                    if ( outer == 0 )
                    {
                        // Only accessible inside of this if block and any other block inside
                        int inTheIf = 33;

                        for( int i=0; i<20; i++  )
                        {
                            // both inTheIf and the for-loop varible are accessible in here
                            System.out.println("Value of inTheIf: " + inTheIf++);
                            System.out.println("Index: " + i);
                        }

                        outer = inTheIf % 6; // should set outer to 5

                        // This will be a compile error - i is not visible here
                        if ( i == 20)
                        {
                            System.out.println("Value of i: " + i);
                        }

                        // the closs varible, the method varible, and inTheIf are all visible here
                        aClassVariable = outer * inTheIf;

                    }
                }

                public void methodTwo()
                {
                    // again, a class variable is access inside a class method
                    if (aClassVaraible != 0)
                    {
                        System.out.println("Method one must have been called!");
                    }

                    try
                    {
                        // variables declared inside a try block
                        int noom = 9;
                        int denom = 0;

                        int boom = noom/denom;
                    }
                    catch(Exception e)
                    {
                        System.out.println("Oops! An exception");
                        // This statement causes a compile error because denom not visible here
                        System.out.println("Cannot divide by " + denom);
                    }
                }
            }

        }
    }
}
