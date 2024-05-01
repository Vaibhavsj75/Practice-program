public class NumberTriangle {

    public static void printNumberTriangle(int rows) 
    {
        for(int i=0;i<=rows;i++);
        {
            for(int j=0;j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");  
            }
            
            for(int 1=i-1;1>=i;1--);
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

    public static void main(String[] args)
    {
    int rows = 5;
    printNumberTriangle(rows);
    
}



