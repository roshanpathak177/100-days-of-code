import java.util.Scanner;

public class ifElsePractice {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("what's your marks out of 100");
//        int marks = in.nextInt();
//        if(marks>80){
//            System.out.println("you've got an A grade");
//        } else if (marks > 50) {
//            System.out.println(" you've passed boi");
//        } else{
//            System.out.println("you failed bro, study more");
//        }
        //Largest Number Question
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter 3 numbers");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        //find the largest of a,b,c
//        int max = a;
//        if (max < b){
//            max = b;
//        } else if (max < c) {
//            max =c;
//        }
//        System.out.println("the largest number is: " + max);
        //case check question
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >'a' && ch <'z'){
            System.out.println("Lower Case");
        } else{
            System.out.println("Upper Case");
        }
    }

}
