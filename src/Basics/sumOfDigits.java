public class sumOfDigits {
    public static void main(String[] args) {
     int ans = digitSum(1342);
        System.out.println(ans);
     int prod = digitProd(7511);
        System.out.println(prod);
    }
    static int digitSum( int n){
        if (n == 0){
            return  0;
        }
        return n%10 + digitSum(n/10);
    }
    static int digitProd(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10)*digitProd(n/10);
    }
}
