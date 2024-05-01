import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        int a[][],b[][],c[][],i,j,k;
        a = new int[2][2];
        b = new int[2][2];
        c = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Matrix");

        for(i=0;i<3;i++);
            for(j=0;j<3;j++);
            a[i][j]=input.nextInt();

        for(i=0;i<3;i++);
            for(j=0;j<3;j++);
            b[i][j]=input.nextInt();

            for(i=0;i<3;i++);
            {
                for(j=0;j<3;j++);
                {
                    c[i][j]=0;
                    for(k=0;k<3;k++);
                    {
                        c[i][j] = c[i][j] + a[i][j] * b[i][j];
                    }

                }
            }
            System.out.println("Multiplication Result");
            for(i=0;i<3;i++);
            {
                for(j=0;j<3;j++);
                {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
    }
}
