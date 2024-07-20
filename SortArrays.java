import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 3, 1, 4, 7, 6};
        // String array
        String[] stringArray = {"apple", "orange", "banana", "kiwi", "grape"};

        // Sorting numeric array
        Arrays.sort(numericArray);
        // Sorting string array
        Arrays.sort(stringArray);

        // Printing sorted arrays
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
