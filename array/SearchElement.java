class SearchElement
{
    public static void main(String[] args)
    {
        int[] a = {11, 23, 45, 1, 34, 61, 73};
        int e = 11;
        boolean f = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==e)
            f=true;
        }
        if(f)
            System.out.println("Element --> "+e+" is present in the array");
        else
            System.out.println("Element --> "+e+" is not present in the array");
    }
}
