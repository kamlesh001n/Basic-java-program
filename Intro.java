public class Intro {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(10)); 
    }

    public static int factorialOfNumber(int num) {
        int ans = 1;
        for (int i = num; i > 1; --i) {
            ans *= i;
        }
        return ans;
    }
}
