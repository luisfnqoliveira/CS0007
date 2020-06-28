import java.util.Scanner;

public class CalculateSumOfUserNumbers {


    public static int addAllElements(int[] array)
    {
        int sum=0;
        for( int i=0; i<array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }

    public static int getUserInput()
    {
        Scanner kdb = new Scanner(System.in);
        System.out.println("Input a positive number, and type -1 to exit!");
        int input = kdb.nextInt();
        return input;
    }

    public static int fillArray(int[] array, int start)
    {
        int numberInserted = 0;
        int insertPosition = 0;
        int userInput;
        do
        {
            insertPosition = start + numberInserted;
            userInput = getUserInput(); // userInput = -1
            if(userInput>=0)
            {
                array[insertPosition] = userInput;
                numberInserted += 1;
            }
        } while(  (userInput != -1) && (insertPosition<array.length)  );
        return numberInserted;
    }


    public static void main(String [] args)
    {

        // Create an array
        // Get user input until I see a -1
        // Put the number in the array
        // Call the function that adds the together
        // Show the result
        final int SIZE_OF_ARRAY = 10;
        int[] theArray = new int[SIZE_OF_ARRAY];
        int numberOfElementsInArray = 0;

        // Will ask for input until the user inputs -1
        int numberOfInsertedElements = fillArray(theArray, numberOfElementsInArray);
        numberOfElementsInArray = numberOfElementsInArray + numberOfInsertedElements;

        // Will ask for input again until the user inputs -1
        numberOfInsertedElements = fillArray(theArray, numberOfElementsInArray);
        numberOfElementsInArray = numberOfElementsInArray + numberOfInsertedElements;

        int sum = addAllElements(theArray);

        System.out.println("The total of adding the " + numberOfElementsInArray + " elements of the array is: " + sum);

    }
}
