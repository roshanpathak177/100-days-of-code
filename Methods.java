import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        sum();
        System.out.println("happy birthday");
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt () ;
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt():
        int sum = num1 + num2;
        System.out.println("The sum = "+ sum)
    }
}
