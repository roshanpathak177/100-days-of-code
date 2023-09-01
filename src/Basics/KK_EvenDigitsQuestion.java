public class KK_EvenDigitsQuestion {
    public static void main(String[] args) {
    int [] nums= {12, 345,2,6,7896};
        System.out.println(findNums(nums));
        System.out.println(digits(5786));
    }
    static int findNums(int[] nums){
        int count = 0;
        for (int num : nums){
            if( even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check even no. of digits
    static boolean even(int num){
    int numOfDigits = digits(num);
    /*if(numOfDigits % 2 ==0){
        return true;
    }
    return false;*/
        return numOfDigits %2 ==0;
    }
    //count no. of digits in a num
    static int digits(int num){
    int count =0;
    while(num >0){
        count ++;
    num = num/10;
    }
    return count;
    }
}
