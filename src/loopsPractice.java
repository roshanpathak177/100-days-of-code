import java.util.Scanner;
public class loopsPractice {
    public static void main(String[] args) {
//        for(int i=0; i <=10; i++){
//            System.out.println(i);
//        }
//        for (int i =1; i <=10; i++){
//            int num = 5;
//            System.out.println(num+" x "+ i +" = "+ num*i);
//        }
//          for (int i=0; i <= 20;i++){
//              if(i % 2 ==0){
//                  System.out.println(i);
//              }
//          }
//         int sum =0;
//         for (int i =0; i<=100;i++){
//             sum += i;
//             }
//        System.out.println("Sum of no.s from 1 to 100 is "+ sum);
//          Scanner in = new Scanner(System.in);
//          System.out.println(" Please Enter the no.");
//          int n = in.nextInt();
//
//          while (n >= 0){
//              System.out.println("What is the Number?");
//              n = in.nextInt();
//          }
        /*
        do while loop:
        syntax:
        do{
        }while();
         */
//        int n =1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=5);
        //Counting Occurrences of a digit in a number
//        int n= 137834731;
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            if(rem==3){
//                count++;
//            }
//            n= n/10;
//        }
//        System.out.println(count);
        //Reversing the given number
        int n=348475;
        int count =0;
        while(n>0){
            int rem = n%10;
            count = count*10 +rem;
            n= n/10;
        }
        System.out.println("the reverse of given number is: "+ count);

    }
}
