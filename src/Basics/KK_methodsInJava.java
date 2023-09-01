 import java.util.Scanner;

public class KK_methodsInJava {
    public static void main(String[] args) {
     //Take input of 2 no.s and output the sum
//     Scanner in = new Scanner(System.in);
//
//        System.out.println("please enter no. 1");
//        int num1 =in.nextInt();
//        System.out.println("Enter 2nd no.");
//        int num2 = in.nextInt();
//        System.out.println("The sum of the given numbers is");
//        int sum= num1 + num2;
//        System.out.println(sum);
//    int ans = sum2();
//        System.out.println(ans);
    String message= greet();
        System.out.println(message);
    }
    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);

        System.out.println("please enter no. 1");
        int num1 =in.nextInt();
        System.out.println("Enter 2nd no.");
        int num2 = in.nextInt();
        System.out.println("The sum of the given numbers is");
        int sum= num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter no. 1");
        int num1 =in.nextInt();
        System.out.println("Enter 2nd no.");
        int num2 = in.nextInt();
        System.out.println("The sum of the given numbers is");
        int sum= num1 + num2;
        System.out.println(sum);
    }
    static String greet(){
        String greeting = "Boy howdy!";
        return greeting;
    }
}
