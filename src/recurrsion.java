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

}
