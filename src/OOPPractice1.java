public class OOPPractice1 {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 19);
        Student bob = new Student("Bob", 20);
        System.out.println(alice.name);
        System.out.println(alice.age);
        System.out.println(bob.name);
        System.out.println(bob.age);
    }
    static class Student{
        String name;
        int age;

        Student( String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
