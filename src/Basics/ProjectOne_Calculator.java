import java.util.Scanner;

public class ProjectOne_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user until they don't press X or x
        int ans = 0;
        while(true){
            //take operator as input
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op =='-' || op == '*' || op =='/' || op == '%'){
                //input two numbers
                System.out.println("Enter 2 Numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                System.out.print("Ans is: ");
                if(op == '+'){
                    ans= num1 + num2;
                }
                if(op == '-'){
                    ans= num1 - num2;
                }
                if(op == '*'){
                    ans= num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans= num1 / num2;
                    }
                }
                if(op == '%'){
                    ans= num1 % num2;
                }
            } else if(op =='x' || op =='X'){
                break;
            } else{
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }

    }
}
