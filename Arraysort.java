import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 3, 1, 4, 7, 6};
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
    }
}
