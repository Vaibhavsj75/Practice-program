import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) 
    {
        int a[] =new int[5];
        int n, count=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in array ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array elements ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nEnter search elements ");
        n=r.nextInt();
        for(int i=0; i<a.length; i++)
        {
            if (a[i]==n)
            {
                count++;
            }
        }
        if (count>0)
        {
            System.out.print("Item found" +count+ "Times");
        }
        else
        {
            System.out.print("Item not found"); 
        }
        
    }

}

