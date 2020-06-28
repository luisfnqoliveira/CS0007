public class FunctionCallingArrays {


    public static void primitiveTypeArgument(int x)
    {
        x = x + 1;
    }

    public static void arrayArgument(int[] x)
    {
        x[1] = x[1] + 1;
    }

    public static void main(String[] args)
    {

        // x is not changed by the function
        //    because x is copied into the function
        int x=0;
        System.out.println(x);
        primitiveTypeArgument(x);
        System.out.println(x);

        // x[1] is changed by the function
        //    because the address of y is copied into the function
        //    therefore the same memory is being modified
        int[] y={0,0,0};
        System.out.println(y[1]);
        arrayArgument(y);
        System.out.println(y[1]);

    }
}
