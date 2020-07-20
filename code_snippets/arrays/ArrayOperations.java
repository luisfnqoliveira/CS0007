public class ArrayOperations {


    private static int[] deepCopy(int[] otherArray) {
        int[] newArray = new int[otherArray.length];
        for (int i = 0; i < otherArray.length; i++) {
            newArray[i] = otherArray[i];
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean compareArrays(int[] array, int[] array2)
    {
        if(array.length != array2.length) return false;

        for(int i=0; i<array.length; i++)
        {
            // Compare the elements of the arrays
            if( array[i] != array2[i] ) return false;
        }
        return true;
    }

    /**
     * This function will take an array and find the smallest element
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @return it returns the index of the smallest element
     */
    public static int findMin(int[] array, int start, int end)
    {
        int minIndex = start;
        for(int i=start+1; i<end; i++)
        {
            if( array[i] < array[minIndex] )
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * This function will take an array and find the smallest element
     *
     * @return it returns the index of the smallest element
     */
    public static int findMin(int[] array)
    {
        return findMin(array, 0, array.length);
    }


    /**
     * This function will take an array and find the largest element
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @return it returns the index of the smallest element
     */
    public static int findMax(int[] array, int start, int end)
    {
        int maxIndex = start;
        for(int i=start+1; i<end; i++)
        {
            if( array[i] > array[maxIndex] )
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * This function will take an array and find the largest element
     * @return it returns the index of the smallest element
     */
    public static int findMax(int[] array)
    {
        return findMax(array, 0, array.length);
    }

    /**
     * This function will take an array and find the where an element is
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @param value The value of the element I'm searching for
     * @return it returns the index of the element being searched, or `end` if the element is not found
     */
    public static int find(int[] array, int start, int end, int value)
    {
        for(int i=start; i<end; i++)
        {
            if( array[i] == value )
            {
                return i;
            }
        }
        return end;
    }

    /**
     * This function will take an array and find the where an element is
     * @param value The value of the element I'm searching for
     * @return it returns the index of the element being searched
     */
    public static int find(int[] array, int value)
    {
        return find(array, 0, array.length, value);
    }

    public static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int smallestIndex = findMin(array, i, array.length);
            int smallestNumber = array[smallestIndex];
            int currentNumber = array[i];
            array[i] = smallestNumber;
            array[smallestIndex] = currentNumber;
        }
    }


    public static int[] sumColumns(int[][] array) {
        int []sum = new int[array[0].length];
        for( int row=0; row<array.length; row++)
        {
            int[] thisRow = array[row];
            for (int column = 0; column<array[0].length; column++)
            {
                //for each element in a column -> add the contents of sum in the same column
                sum[column] += thisRow[column];
            }
        }
        return sum;
    }

    public static void main(String[] args) {


        // Using a procedural program
        int[] array = {11, 9, 8, -10, 6, 5, 3, 1, -3 , -6};

        int smallestNumber = findMin(array, 4, 9 );
        System.out.println("The smallest number is in index " + smallestNumber + " and its value is " + array[smallestNumber]);

        int largestNumber = findMax(array);
        System.out.println("The largest number is in index " + largestNumber + " and its value is " + array[largestNumber]);

        int value = 11;
        int elementIndex = find(array, 5, 10, value);
        if( elementIndex != array.length ) {
            System.out.println("The number " + value + " is in index " + elementIndex + " and its value is " + array[elementIndex]);
        } else {
            System.out.println("Did not find the number " +value);
        }

        selectionSort(array);
        printArray(array);


        int[][] twoDArray = {
                { 1,  2,  3},
                { 4,  5,  6},
                { 7,  8,  9},
                {10, 11, 12}
        };


        int[] sumOfColumns = sumColumns(twoDArray);
        printArray(sumOfColumns);



    }
}
