import java.util.Scanner;
class ReverseArray
{
    static void usingForLoop(int[] a)
    {
        int[] b = new int[a.length-1];
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void swapping(int[] a)
    {
        int start=0, end = (a.length-1);
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
             a[end]=temp;
             start++;
             end--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        
        int[] a = new int[size];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Please enter a integer value at "+ i +" position");
            a[i] = sc.nextInt();
        }
        System.out.print("Revered Array is(Using for loop) : ");
        usingForLoop(a);
        System.out.print("\nRevered Array is(Swapping) : ");
        swapping(a);
    }
}
