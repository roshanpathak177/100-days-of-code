public class KK_BinarySearch {
    public static void main(String[] args) {
    int [] arr={1,3,5,7,11,17,38,49,50,77,89,90,95,106,188,300,500,678};
    int target = 50;
    int ans= binarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist

    static int binarySearch(int[] arr, int target){
     int start=0;
     int end= arr.length -1;

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
