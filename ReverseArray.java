import java.util.Scanner;

public class ReverseArray {
    
    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter elements in array");
        for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.println("array element ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\narray reverse element ");
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
