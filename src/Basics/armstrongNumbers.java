public class armstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        for (int i = 100; i < 999; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            sum += cube;
            n = n/10;
        }
        return sum == original;

    }
}
