public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
