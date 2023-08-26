import java.util.Arrays;
import java.util.Scanner;

public class KK_arrays {
    public static void main(String[] args) {
        //syntax
        //datatype[] variableName = new datatype[size];
        //Q:store 5 roll no.s
        int[] rollNos = new int[5];
        int[] rnos = {1,2,3,43,65};

        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5];//actual memory creation is happening here.(heap memory// )
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

//        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Roshan";
        System.out.println(Arrays.toString(str));


    }
}
