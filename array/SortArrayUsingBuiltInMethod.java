import java.util.Arrays;
class SortArrayUsingBuiltInMethod
{
    public static void main(String[] args)
    {
        int[] a = {3,5,2,6,1,7};
        Arrays.sort(a);
        for(int e:a)
        {
          System.out.print(e);
        }
        System.out.println();
    }
}
