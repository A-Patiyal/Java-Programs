 import java.util.Arrays;
 class SecondLargestUsingBuiltInMethod
 {
    public static void main(String[] args)
    {
        int[] a = {6,3,7,4,1,5};
        Arrays.sort(a);
        System.out.println("Second largest element : "+a[a.length-2]);
    }
 }
