public class KK_floorOfANumber {
    public static void main(String[] args) {
        int [] arr= {1,3,5,8,11,24,35,39,41,76,89};
        int target = -45;
        int ans= floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start= 0;
        int end= arr.length -1;

        if(target<arr[0]){
            return -1;
        }

        while(start<=end){
            int mid = start +(end-start)/2;

            if(target< arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]){
                start= mid +1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
