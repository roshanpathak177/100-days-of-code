public class ntoOne {
    public static void main(String[] args) {
     int ans=  summation(10);
        System.out.println(ans);
    }

    static void fun (int n){
        if (n  == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev (int n){
        if (n  == 0) {
            return;
        }

        funrev (n-1);
        System.out.println(n);
    }

    static int summation(int n){
        if (n<= 1){
            return 1;
        }
        return n + summation(n-1);
    }
}
