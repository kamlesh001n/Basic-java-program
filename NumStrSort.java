import java.util.Arrays;
import java.util.Scanner;

public class NumStrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read numeric and string inputs
        System.out.println("Enter numbers separated by spaces:");
        String num = sc.nextLine();
        
        System.out.println("Enter strings separated by spaces:");
        String str = sc.nextLine();
        
        // Split the inputs into arrays
        String[] numArr = num.split(" ");
        String[] strArr = str.split(" ");
        
        // Sort the arrays
        Arrays.sort(numArr);
        Arrays.sort(strArr);
        
        // Print the sorted arrays
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numArr));
        System.out.println("Sorted String Array: " + Arrays.toString(strArr));
        
        sc.close();
    }
}
