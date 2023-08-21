public class KK_linearSearchInRange {

    static int linearS(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i= start; i<= end; i++){
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,14,45,5,24,53,78};
        int target = 18;
        System.out.println(linearS(arr,target,1,4));
    }
}
