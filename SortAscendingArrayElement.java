import java.util.Arrays;

public class SortAscendingArrayElement {

    public static void main(String[] args) {

    int[] array = {5, 4, 3, 2, 1};

    Arrays.sort(array);
    
    System.out.println("Array element in ascending order:");
    for(int num : array)
    {
        System.out.println(num + " ");
    } 
}

}
