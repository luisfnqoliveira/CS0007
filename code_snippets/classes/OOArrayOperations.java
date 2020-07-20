
// You need the MyArray.java file
public class OOArrayOperations {


    public static void main(String[] args) {

        // Using a object oriented program
        int[] tempArray = {11, 9, 8, -10, 6, 5, 3, 1, -3 , -6};
        MyArray oo_array = new MyArray(tempArray);

        smallestNumber = oo_array.findMin(4, 9 );
        System.out.println("The smallest number is in index " + smallestNumber + " and its value is " + oo_array.getElementAt(smallestNumber));

        largestNumber = oo_array.findMax();
        System.out.println("The largest number is in index " + largestNumber + " and its value is " + oo_array.getElementAt(largestNumber));

        value = 11;
        elementIndex = oo_array.find(5, 10, value);
        if( elementIndex != oo_array.length() ) {
            System.out.println("The number " + value + " is in index " + elementIndex + " and its value is " + oo_array.getElementAt(elementIndex));
        } else {
            System.out.println("Did not find the number " +value);
        }

        oo_array.selectionSort();
        oo_array.printArray();

    }
}
