//import java.util.Scanner;

public class insert_element_in_array {
    public static void main(String[] args)
    {
       int a[]={1,2,3,4,5,6};
       System.out.println(a.length);
       //Scanner input=new Scanner(System.in);
       int n=10;
       int index=2;
       for (int i=a.length-1;i>index;i--)
       {
        a[i]=a[i-1];
       }
       a[index]=n;
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }

    }
    
}
