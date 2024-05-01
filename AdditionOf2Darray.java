import java.util.Scanner;
public class AdditionOf2Darray {

    public static void main(String[] args) {
        
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter first matrix data");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.println("Enter second matrix data");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                b[i][j]=r.nextInt();
            }
        }
        System.out.println("Enter first matrix data");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("First matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Sum of two matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
