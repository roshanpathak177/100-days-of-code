public class InheritanceMain {
    public static void main(String[] args) {
//        Inheritance.Box box = new Inheritance.Box(5);
//        System.out.println (box.l+ " " + box.w+ " " + box. h) ;

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);

        //there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        //that is why error below
        BoxWeight box4 = new Inheritance.Box(3, 5, 7);
        System.out.println(box4.l);
    }
}
