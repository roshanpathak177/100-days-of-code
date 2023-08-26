import java.util.Arrays;

public class KK_StringMethods {
    public static void main(String[] args) {
        String Name = "Roshan Pathak";
        System.out.println(Arrays.toString(Name.toCharArray()));
        System.out.println(Name.toLowerCase());
        System.out.println(Name.indexOf('o'));
        System.out.println("    Roshan     ".strip());
    }
}
