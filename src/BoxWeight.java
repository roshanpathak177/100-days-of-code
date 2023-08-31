public class BoxWeight extends Inheritance.Box {
    double weight;

    public BoxWeight(){
        weight = -1;
    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l, w, h);//what is this? calls the parent class constructor and is used to initialise values in parent class
        this.weight = weight;
    }
}
