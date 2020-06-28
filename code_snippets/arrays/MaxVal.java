import java.util.Scanner;

public class MaxVal {


    public static int maxValue(int[] array)
    {
        if (array.length == 0) {
            return -1;
        }
        int max = array[0];
        for(int i=0; i<array.length; i++)
        {
            if ( max < array[i] )
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String []args)
    {
        int[] array = {10,20,43,14,5};
        int max = maxValue(array);
        System.out.println(max);
    }

}
