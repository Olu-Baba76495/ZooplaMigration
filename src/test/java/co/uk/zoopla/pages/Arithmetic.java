package co.uk.zoopla.pages;
// we inherit by using the word extends (inheriting from another class)
// if we want to inherit Mathematics then we just type extends in front of Arithmetic followed by Mathematics..see below

import co.uk.zoopla.commons.MentalSums;
import co.uk.zoopla.stepDefinitions.Mathematics;

public class Arithmetic extends Mathematics {
    // instantiation comes up due to the fact that we cannot extend more than 1 class
    // Arithmetic has already inherited Mathematics now to inherit MentalSums see below
    // in order to inherit yet another class (instantiate) we write the name of the class then mentalSums again =
    // new MentalSums like below (i want to get what is inside MentalSums but cannot get it through inheritance

    MentalSums mentalSums = new MentalSums();
    //above is instantiation
    // MentalSums = name of the class; mentalSums is making an object of MentalSums class. (This means we are creating a place
    // folder that will store everything that belongs to the class.
    // so mentalSums go into MentalSums class and saves every method in there into its memory

    int age;

    public void add()
    {
        addingNumber();
        // above is inheritance
    }
    public void exponential()
    {
        mentalSums.exponentialNumber();
        // above is instantiation  // above means method give me what is in your memory
        // As with instantiation, we make an object of the class and then use that object to access all the methods we need

    }
    private boolean canDrive()
    {
        return true;
        //the above method is saying if the guy can drive then return true
    }

    public boolean canHeDrive()
    {
        //age 17 and 80 . In order to write this in code see below

        if (age >= 17 && age <= 80)
        {
           return canDrive();
        }
        // above is a conditional statement
        return false;
    }
    // next below is Loop

    public void timesTable()
    {
          // here we want to loop through a particular number and that number we just want to print it out
        // each time you see for() they are called loop. its like a small method

        for(int i = 1; i <= 12; i++)
        // for means i want to go through the above several times but at some point i want to stop
            // we don't want an infinite loop
            // for the above it means i want an integer and representing the integer with i
            // i can change the i to anything e.g. for(int olu = 1; olu <= 12; olu++)
            // == means i want exactly this
            // interpreting code = int olu = 1 means i want a number and that number is starting from 1
            // olu <= 12 = i want that number to be less than or equal to 12
            //olu++ = i want that number to increment by 1 everytime
        {
            System.out.println();
            // above means you want java to write on the console for you
            // So the above will now look like this System.out.println(9 * olu);
            // the above now means 9 * whatever olu is
            // if olu is 1 then it adds 1, go back again (9 * 2) until it gets to 12  (remember olu <= 12)
        }
    }
}
