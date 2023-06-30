public class maximum_element {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int max=0;
        for(int x:a)
        {
            if(x>=max)
            {
               max=x;
            }
            
        }
        System.out.println(max);
    }
    
}
