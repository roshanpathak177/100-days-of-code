public class KK_shadowing {//shadowing in java is a practice of using two variables with the same name with the scope that overlaps
    static int x=90;// this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);//print 90
        int x;
        //System.out.println(x);// scope will begin when the scope is initialised and not just declared
        x=40;
        System.out.println(x);//will print 40 as lower level is shadowing the upper level
        fun();
    }
    static void fun() {
        System.out.println(x);
    }

}
