public class FindMin {
    //assume arr.length != 0
    //return the min value of the array
    static int min(int[] arr){
    int ans= arr[0];
    for(int i=1; i<arr.length; i++){
        if (arr[i]< ans){
            ans = arr[i];
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        int []arr={14,45,5,24,53,78};
        System.out.println(min(arr));
    }
}
