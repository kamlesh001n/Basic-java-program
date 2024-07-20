import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        moveZerosToEnd(arr);
        
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; 
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        
        while (j < n) {
            arr[j] = 0;
            j++;
        }
    }
}
