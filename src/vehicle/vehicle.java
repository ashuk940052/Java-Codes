package vehicle;

public class vehicle {
    protected String colour ;
    int maxspeed ;
    public vehicle(){
      //  System.out.println("vehicle constructor");
    }
   public vehicle(int maxspeed){
       this.maxspeed= maxspeed;
       System.out.println("vehicle constructor");
   }
   public int getMaxspeed(){
       return maxspeed;
   }
   public void setMaxspeed(int maxspeed){
       this.maxspeed = maxspeed;

   }
   public void print(){
       System.out.println("vehicle colour : " +""+colour);
       System.out.println("vechile maxspeed : "+""+maxspeed);
   }

}
