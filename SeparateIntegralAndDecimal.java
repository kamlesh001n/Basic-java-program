import java.util.Scanner;

public class SeparateIntegralAndDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        int integralPart = (int) number;
        double decimalPart = number - integralPart;

        System.out.println("Integral part: " + integralPart);
        System.out.println("Decimal part: " + decimalPart);

        scanner.close();
    }
}
