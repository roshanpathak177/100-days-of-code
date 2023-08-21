public class KK_scope {
    public static void main(String[] args) {
        int a =10;
        int b=20;

        {
            //int a=90; //Cant initialise outside the block in the same function, as it is already initialised
            a=99; //but we can reassign the value of a
            int c =79;
        }//values initialised in this block will remain in this block
        System.out.println(a);
//        System.out.println(c); //cannot use outside the block if initialized inside it
    }
}
