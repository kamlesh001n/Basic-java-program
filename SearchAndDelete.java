import java.util.Arrays;

public class SearchAndDelete {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Index to search for
        int indexToSearch = 2;
        
        // Search for the value at the given index and delete it
        int value = searchAndDelete(numbers, indexToSearch);
        
        // Print the found value
        if (value != -1) {
            System.out.println("Value found at index " + indexToSearch + ": " + value);
            System.out.println("Array after deletion: " + Arrays.toString(numbers));
        } else {
            System.out.println("Index " + indexToSearch + " is out of bounds.");
        }
    }

    public static int searchAndDelete(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return -1; // Index out of bounds
        }

        int value = array[index];

        // Shift elements to the left to delete the value at the index
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Set the last element to zero (optional, to maintain array length)
        array[array.length - 1] = 0;

        return value;
    }
}
