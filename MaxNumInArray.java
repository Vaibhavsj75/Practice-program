public class MaxNumInArray {
    public static void main(String[] args) {
    
    //     int[] array = {7, 22, 10, 19, 25};

    //     // Initialize max with the first element of the array
    //     int max = array[0];

    //     // Iterate through the array to find the maximum value
    //     for (int i = 1; i < array.length; i++) 
    //     {
    //         if (array[i] > max)
    //         {
    //             max = array[i];
    //         }
    //     }

    //     // Print the maximum value
    //     System.out.println("Maximum number in the array: " + max);
    // }

// Least Number In Array
int[] array ={7, 22, 10, 19, 25};

int min =array[0];

for(int i = 1; i < array.length; i++)
{
    if(array[i] < min)
    {
        min = array[i];
    }
}
System.out.println("Minimun number in the array: " + min);

}

}

