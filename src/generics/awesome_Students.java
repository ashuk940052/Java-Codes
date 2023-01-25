package generics;

public class awesome_Students implements print_Interface {
    public int rollno ;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void print(){
        System.out.print(rollno);
    }
}
