import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in= new Scanner(System.in);
//        String fruit= in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "grape" -> System.out.println("small fruit");
//            default -> System.out.println("Please enter a different fruit");
//        }
        int day =in.nextInt();
        //Use of not putting a break condition
//        switch (day){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
