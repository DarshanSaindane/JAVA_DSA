abstract class plane{
    public abstract void takeoff();
    public abstract void fly();
    public abstract void land();
}
class cargoPlane extends plane{
    public void takeoff(){
        System.out.println("cargoPlane is tookoff..");
    }
     public void fly(){
        System.out.println("cargoPlane is flying..");
    }
     public void land(){
        System.out.println("cargoPlane is landing..");
         System.out.println();
    }
     
}
class passangerPlane extends plane{
     public void takeoff(){
        System.out.println("passangerPlane is tookoff..");
    }
    public void fly(){
        System.out.println("passangerPlane is flying..");
    }
     public void land(){
        System.out.println("passangerPlane is landing..");
         System.out.println();
    }
  
}
class fighterPlane extends plane{
    public void takeoff(){
        System.out.println("fighterPlane is tookoff..");
    }
     public void fly(){
        System.out.println("fighterPlane is flying..");
    }
     public void land(){
        System.out.println("fighterPlane is landing..");
        System.out.println();
    }

}
class Airport{
    public void allowPlane(plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}
public class AbstractClassCode1{
    public static void main(String[] args){
        Airport a = new Airport();
        a.allowPlane(new cargoPlane());
        a.allowPlane(new passangerPlane());
        a.allowPlane(new fighterPlane());
        
 
    }
}