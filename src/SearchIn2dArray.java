import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {45, 56, 67},
                {23, 34, 65}
        };
        int target =45;
        int[] ans= search(arr, target);//format of return value will be {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[]search(int [][] arr, int target){
        for( int row= 0; row< arr.length; row ++){
            for(int col=0; col <arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for( int [] ints : arr){
            for(int element: ints){
                if (element > max){
                    max= element;
                }
            }
        }
        return max;
    }
}
