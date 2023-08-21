import java.util.Arrays;
import java.util.Scanner;

public class KK_arrays {
    public static void main(String[] args) {
        //Q:store 5 roll no.s
        //syntax
        // datatype[] variable_name =new datatype[size]
        int[] rnos =new int[5];
        //or directly
        int[] rnos2 ={23, 12, 56, 1, 3};

        System.out.println(rnos2[1]);
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //input using for loops
        for (int i = 0; i <arr.length; i ++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i <arr.length; i ++){
            System.out.print(Arrays.toString(arr));
        }
    }
}
