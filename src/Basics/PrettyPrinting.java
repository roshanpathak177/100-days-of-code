public class PrettyPrinting {
    public static void main(String[] args) {
        float a =36.1879f;
        System.out.printf("The Formatted num is %.2f", a);// % this is a placeholder, .2f means till second decimal place. it also rounds off.
        System.out.println(" ");
        System.out.printf("Pi: %.3f", Math.PI);
        System.out.println('a' + 'b');
        System.out.printf("Hi My name is %s and I am %s", "Roshan", "Awesome");
    }
}
