import java.util.ArrayList;
import java.util.Scanner;

public class KK_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(4);
//        list.add(453);
//        list.add(2745);
//        list.add(4315);
//        list.add(345);
//        list.add(456);
//        list.add(453);
//        list.add(2745);
//
//        System.out.println(list);
//        //ArrayList Function
////        System.out.println(list.contains(456));
////        System.out.println(list.contains(4561));
//        //change value of a particular element
//        list.set(0, 1);
//        System.out.println(list);
//        //remove an element
//        list.remove(3);
//        System.out.println(list);

//        //input
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        //get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here.
//        }
//        System.out.println(list);
        //multidimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
