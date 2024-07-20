public class factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfNnumber(5));
    }
    static int factorialOfNnumber(int num){
        int ans =1;
        for (int i = num; i>1; i--) {
            ans=ans*i;
        }
        return ans;
    }
}
