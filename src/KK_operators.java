import java.util.ArrayList;

public class KK_operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out .println("a" + "b");
        System.out.println( (char) ('a' + 3));
        System.out.println("a" + 1);//when string and integer are concatenated integer will be converted into (Rapper class) Integer that will call toString()
        System.out.println("Kunal" + new ArrayList<>()) ;
        System.out.println("Kunal" + new Integer (5)) ;
    }
}
