public class KK_staticBlock {
    static int a = 6;
    static int b;
// will run only once, when the first object is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I am a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        KK_staticBlock obj = new KK_staticBlock();
        System.out.println(KK_staticBlock.a + " " + KK_staticBlock.b);
    }

}
