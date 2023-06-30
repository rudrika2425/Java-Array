public class second_largest_element {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max1)
            {
                max2=max1;
                max1=a[i];
               
            }
            else if( a[i]>max2)
            {
                max2=a[i];
            }
            
        }
        System.out.println(max2);
    }   
    
}
