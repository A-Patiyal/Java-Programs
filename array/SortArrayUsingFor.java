class SortArrayUsingFor
{
    static void sortedArray(int[] a)
    {
        int temp = a[0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]);
        } 
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] a = {4,1,5,2,7,3,6};
        sortedArray(a);
    }
}
