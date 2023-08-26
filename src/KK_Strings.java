public class KK_Strings {
    public static void main(String[] args) {
        String a = "Roshan";
        String b = "Roshan";
        System.out.println(a==b);//this gives true because both a and b are pointing towards a common object "roshan" created in the string pool
        String c = new String("Roshan");
        System.out.println(a==c);// this gives false, because of the keyword new, we create a new object outside the pool but inside the heap
    }
}
