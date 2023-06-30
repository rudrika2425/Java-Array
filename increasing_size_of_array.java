public class increasing_size_of_array {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[2*a.length];
        int c=a.length-1;
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[c-i];
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    
}
