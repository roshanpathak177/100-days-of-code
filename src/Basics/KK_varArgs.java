import java.util.Arrays;

public class KK_varArgs {
    public static void main(String[] args) {
        fun();
    }
    static void fun(int ...v){//when we dont know how many variables we will be taking.
        System.out.println(Arrays.toString(v));

    }
}
