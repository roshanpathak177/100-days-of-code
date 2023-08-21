public class KK_orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr={899,788,677,566,455,344,24,17,7,6,5,2,1};
        int target = 7;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int s= 0;
        int end= arr.length -1;

        // Find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[s] < arr[end];

        while(s <= end){
            //find the middle element
            //int mid = (start + end)/2; //might be possible that the sum of these values may exceed the limit of the int
            int mid= s + (end - s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
