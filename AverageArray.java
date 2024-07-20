public class AverageArray {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the average
        double average = calculateAverage(numbers);

        // Print the result
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
