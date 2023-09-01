public class infiniteArray {
    public static void main(String[] args) {
    int [] arr={1,2,3,4,5,7,9,11,12,13,16,17,18,19,23,26,27,28,29,31,36,38,39,42,46};
    int target =38;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //first find range
        //first start with box of size 2
        int start= 0;
        int end= 1;
        //condition for the target to lie in the range
        while (target> arr[end]){
            int temp = end;
            //double the box value
            //newEnd= end+2*boxSize
            end = end + (end-start+1)*2;
            start = temp + 1;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){


        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2; //might be possible that the sum of these values may exceed the limit of the int
            int mid= start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid +1;
            } else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
