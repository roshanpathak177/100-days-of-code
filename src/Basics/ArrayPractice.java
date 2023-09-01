import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        
        int[] arr = {4, 6, 7, 19, 37, 1, 78, 18}; 
        int sum =0;

//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("the sum of all the elements is " + sum);
//        System.out.println("the average is " + (sum/arr.length));
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *=2;
//        }
//        System.out.println("The Updated array is: ");
//        for( int value: arr){
//            System.out.print(value + " ");
//        }
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length -1;
        while (start <end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
