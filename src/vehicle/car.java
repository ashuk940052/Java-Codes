package vehicle;

public class car extends vehicle {
    int numgears ;
    boolean isconvertible;
public car(){
    System.out.println("I am a Car");
}
    public car(int numgears , int maxSpeed){
        super(maxSpeed);
        super.colour="black";
        this.numgears = numgears;
        System.out.println("Car constructor");
    }

    public boolean isIsconvertible() {
        return isconvertible;
    }

    public void print(){
     super.print();
        System.out.println("number of gears : "+""+numgears);
        System.out.println("is convertible : "+ " "+isconvertible);
    }

}
