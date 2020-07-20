public class MyArray {

    private int[] array;

    public MyArray( int[] otherArray ) {
        array = deepCopy(otherArray);
    }

    private int[] deepCopy(int[] otherArray) {
        int[] newArray = new int[otherArray.length];
        for (int i = 0; i < otherArray.length; i++) {
            newArray[i] = otherArray[i];
        }
        return newArray;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean compareArrays(int[] array2)
    {
        if(array.length != array2.length) return false;

        for(int i=0; i<array.length; i++)
        {
            // Compare the elements of the arrays
            if( array[i] != array2[i] ) return false;
        }
        return true;
    }


    public int getElementAt(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
    /**
     * This function will take an array and find the smallest element
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @return it returns the index of the smallest element
     */
    public int findMin(int start, int end)
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
    public int findMin()
    {
        return findMin(0, array.length);
    }


    /**
     * This function will take an array and find the largest element
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @return it returns the index of the smallest element
     */
    public int findMax(int start, int end)
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
    public int findMax()
    {
        return findMax(0, array.length);
    }

    /**
     * This function will take an array and find the where an element is
     * @param start The index of the first element to be searched
     * @param end The index of the first element NOT to be searched
     * @param value The value of the element I'm searching for
     * @return it returns the index of the element being searched, or `end` if the element is not found
     */
    public int find(int start, int end, int value)
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
    public int find(int value)
    {
        return find(0, array.length, value);
    }

    public void selectionSort()
    {
        for (int i = 0; i < array.length; i++)
        {
            int smallestIndex = findMin(i, array.length);
            int smallestNumber = array[smallestIndex];
            int currentNumber = array[i];
            array[i] = smallestNumber;
            array[smallestIndex] = currentNumber;
        }
    }


}
