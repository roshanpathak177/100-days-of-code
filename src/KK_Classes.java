public class KK_Classes {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        //Student Roshan;//declaring the reference to object, it is just in the stack memory
        //Roshan = new Student();
//        Student Roshan = new Student();
//        Roshan.rno =15;
//        Roshan.name = "Kunal";
//        Roshan.marks = 88.5f;
        Student Roshan = new Student(21, "Roshan Pathak", 95.4f);
        System.out.println(Roshan.rno);
        System.out.println(Roshan.name);
        System.out.println(Roshan.marks);

        Roshan.greeting();
    }
    //create a class
    //for every single student
    static class Student{
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello! My name is " + name);
        }
        //When you call the constructor with no values it will call the Student() constructor, when you call it with 3 values it will call Student (int rno, String Name, float marks) constructor.
        //this is known as constructor overloading.
        Student(){
            this.rno =13;
            this.name ="kunal";
            this.marks = 89.5f;
        }
        Student (int rno, String Name, float marks) {
            this.rno = rno;
            this.name = Name;
            this.marks = marks;
        }
    }




}
