import java.util.Locale;
import java.util.Scanner;

public class KK_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = in.next();
        System.out.println(isPalindrome(word));

    }
    static boolean isPalindrome(String str){
        if(str.length() == 0){
            return true;
        }
        str =str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
