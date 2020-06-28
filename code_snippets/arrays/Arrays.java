import java.util.Scanner;

public class Arrays {

    public static void main(String []args)
    {

        final int SIZE = 5; // This is the size of the array, I use a constant to make the code more readable
        int[] theArray = new int[SIZE]; // Once you initialize the array, its size cannot be changed!

        int[] oneMoreArray = {1,2,3,4,5}; // This array is filled with these numbers, the size of the list dictates the size of the array


        // This will print not print the contents, but something that represents the address of the array in memory
        System.out.println(theArray);

        // This is how you change an element of the array (element in position 0, 1, and 2 in this example)
        theArray[0] = 10;
        theArray[1] = 20;
        theArray[2] = 30;

        // This is how you access elements of the array
        System.out.println(theArray[0]);     // Indices start at 0 and end at length-1
        System.out.println(theArray[1]);
        System.out.println(theArray[2]);
        System.out.println(theArray[3]);
        System.out.println(theArray[4]);
        // System.out.println(theArray[5]);   -> This is an error (off by one! :)


        int whereToInsert = 0;      // It is useful to keep track of how many valid elements there are in an array! For that an extra variable is useful.
        int[] anotherArray = new int[SIZE]; // The array was created in memory, but we didn't put anything in it

        anotherArray[whereToInsert] = 1;  // We insert in position 0 and increment the variable
        whereToInsert++;                  //    next time, we will insert in the next empty position

        anotherArray[whereToInsert] = 2;
        whereToInsert++;

        anotherArray[whereToInsert] = 3;
        whereToInsert++;

        System.out.println("The size of array theArray is " + anotherArray.length + ", however it only has " + whereToInsert + " valid entries :)");

    }



}
