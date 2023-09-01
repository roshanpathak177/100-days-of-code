import java.util.Scanner;
public class MethodsOfJava {
    public static void main(String[] args) {
//    sum();
//      greeting();
//       int ans = sum2();
//        System.out.println(ans);
//        String message = greet();
//        System.out.println(message);
        int ans = sum3(5,8);
        System.out.println(ans );
    }

    //pass the value of numbers when you are calling the function in main()
    //we do that via parameter
    static int sum3(int a, int b){
        return a+b;
    }
    static void sum(){
        Scanner in = new Scanner (System. in) ;
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print ("Enter number 2: ");
        int num2 = in.nextInt () ;
        int sum = num1 + num2;
        System.out.println("The sum = " + sum) ;
    }

    static void greeting(){
        System.out.println("Hello World");
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner (System. in) ;
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print ("Enter number 2: ");
        int num2 = in.nextInt () ;
        return num1 + num2;
    }
    static String greet(){
        String Greeting = "How you doin'";
        return Greeting;
    }

}
