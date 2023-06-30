public class deleting_an_element {
    public static void main(String[] args)
    {
        int A[]={1,2,3,4,5,6};
        int x=3;
        int index=0;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(x==A[i])
            {
              count+=1;
              index =i;
              
            }
        }
        System.out.println(index);
        if(count==1)
        {
            for(int i=index;i<A.length;i++)
        {
            A[i]=A[i+1];
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    }
    
}
