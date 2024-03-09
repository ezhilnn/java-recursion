public class recurrsion {
    public static void main(String[] args) {
        int ans=sum1(10);
        System.out.println(ans);
        int ans2=sum2(1342);
        System.out.println(ans2);
        int ans3=prod(1342);
        System.out.println(ans3);
        int ans4=rev(1342);
        System.out.println(ans4);
//        int ans5=rev1(1342);
        rev1(1342);
        System.out.println(sum);
        System.out.println(rev2(13234));
        System.out.println(palindrome(12321));
        System.out.println(palindrome(12323));
        System.out.println(count(1020305));
    }
    public static int  sum1(int n){
        if(n==1){
            return 1;
        }
        return n+sum1(n-1);
    }
    public static int  sum2(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum2(n/10);
    }
    public static int  prod(int n){
        if(n%10==n){
            return n;
        }
        return n%10*prod(n/10);
    }
//    public static  int rev(int n){
//        if(n%10==n){
//            return n;
//        }
//        return (n%10)*10+rev(n/10);
//    }
public static int rev(int n) {
    int val = 0;
    if (n == 0) {  // Base case: if the number becomes 0
        return val; // Return the accumulated reversed value
    }
    // Accumulate the reversed digits by multiplying the accumulated value by 10 and adding the current digit
    val = (n % 10) + val * 10;
    // Recursively reverse the remaining part of the number
    return rev(n / 10, val);
}

    // Overloaded helper method for recursive calls with accumulated reversed value
    private static int rev(int n, int val) {
        if (n == 0) {  // Base case: if the number becomes 0
            return val; // Return the accumulated reversed value
        }
        // Accumulate the reversed digits by multiplying the accumulated value by 10 and adding the current digit
        val = (n % 10) + val * 10;
        // Recursively reverse the remaining part of the number
        return rev(n / 10, val);
    }
    static int sum=0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        sum=sum*10+n%10;
        rev1(n/10);

    }
    static int rev2(int n) {

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static boolean palindrome(int n){
        if(n==rev2(n)){
            return true;
        }
        return false;
    }
    static int count(int n) {
        return helper1(n, 0);
    }


    private static int helper1(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper1(n/10, c+1);
        }
        return helper1(n/10, c);
    }
    public int numberOfSteps(int num) {
        return helper2(num, 0);
    }

    private int helper2(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper2(num/2, steps+1);
        }
        return helper2(num-1, steps+1);
    }

}
