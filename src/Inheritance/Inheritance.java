public class Inheritance {

    public static class Box{
        double l;
        double w;
        double h;

        Box(){
            this.h = -1;
            this.w = -1;
            this.l = -1;
        }
        //Cube
        Box(double side){
            this.l = side;
            this.h = side;
            this.w = side;
        }
        Box(double l, double h, double w){
            this.h = h;
            this.w = w;
            this.l = l;
        }
        Box(Box old){
            this.h = old.h;
            this.w = old.w;
            this.l = old.l;
        }
    }
}
