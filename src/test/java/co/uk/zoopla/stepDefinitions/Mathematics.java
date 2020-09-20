package co.uk.zoopla.stepDefinitions;

public class Mathematics {
//String is used for name (with quote and semi colon)
    // All the below which are above methods are called = Global Variable
// we can have both public and private variables
    // Example -> public String nameOlu = "Olu Olu 34" -> Visible to Arithmetic Class
    // private String nameSayo = "Sayo Sayo 24" -> Not visible to other or external classes
    String nameOlu = "Olu Olu 34";
    String nameSayo = "Sayo Sayo 24";
    String nameBaba = "29";
    String houseNumber = "2";

    // int is used for numbers (with no quote, only semi colon)
    int age = 24;
    int numberOfHouse = 24;
    double price = 34.56;

    // double is used for writing decimal like above

    float bigNumber = 1234567890;
    // float is used to write big numbers

    boolean isDisplayed = true;
    //boolean is used for yes or no; true or false situation. A question is asked to give yes or no
    // -> is called comment and you're saying to Java do not worry about this line
    // notice all the above are not inside the method below
    // they can also be in between the methods

    public void addingNumbers()
    {
        System.out.println(nameOlu);
        // the above means it will write "Olu Olu 34"
        // if "Olu Olu 34" changes to "Olu Olu 500" just change once and others updates
        // any variable written inside a method is called a local variable
        // the influence of a local variable is only limited to inside the method e.g. below
        String hey = "Is a good man";
        // I can also write: System.out.println(nameOlu + hey);
        // whilst the above is a Global Variable, String hey is a local variable within the public void
        System.out.println(nameOlu + hey);
        // See as nameOlu is purple (Global) and hey is white (local)

    }

    // Some of the above can be written here too, they are still outside the methods but not advisable.
    // every of my variables? declare everything at the top
    // All the variables (Data type) at the top are called global variables

    private void subtractingNumbers()
    {
// I can also use the name "Olu Olu 34" here because it is a global variable see below
        System.out.println(nameOlu);
        // System.out.println(nameOlu + hey);
        // the above throws red with "hey" because hey is localised within public void method
        // if we tried same with nameSayo it's fine see below because nameSayo is a global variable
        System.out.println(nameOlu + nameSayo);

        // everything above methods can be regarded as one declaring variables

    }

    public int addingNumber()
    {
        // here within this method when java performs this action return an integer back to me
        // remember void means perform the action and don't return anything back to me. see below
        // *Anytime you write public and there is no void then you need to type return see below

        return 3 + 6;
        // this means everytime i run this method it will give me 9
        // the methods public int and private int are restrictive
        // because it's not everytime we want to add 3+6 or 5-3

    }

    // what if we want to add 12+5 or subtract 9-2? this is where parameterize comes in.. see below
    // so if we write another method "public int AddingNumber() it will throw error due to duplication of code but see
    public int addingNumber(int a, int b)
    {
        // what i've done above has removed the red line or error on the first public int AddingNumber
        return a + b;
        // effectively we've made the method "public int AddingNumber" more dynamic
        // we parameterized it by dropping variables that will represent what we will use during run time
        // what if we want to add 3 numbers? also see below
    }
    public int addingNumber(int a, int b, int c)
    {
        // again Java will throw red line error because of code duplication "public int AddingNumber(int a, int b)
        // you just need to add another variable (int a, int b, int c) see method above now updated; error disappears
        // now see below
        return a + b + c;
        // above is parameterizing the method
    }
    private int subtractingNumber()
    {
        return 5 - 3;
    }
}
