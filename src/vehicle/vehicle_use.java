package vehicle;

public class vehicle_use {
    public static void main(String[] args) {

        vehicle v = new vehicle();

        v.setMaxspeed(100);
        v.colour = "Megenta";
        v.print();

        car c = new car(7, 220);
        c.isconvertible=true;
        c.print();


    }
}
