class Employee{
    private String eid;
    private String ename;
    private int eage;

    //setters
    public void setEid(String eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEage(int eage){
        this.eage = eage;
    }

    //getters
    public String getEid(){
        return eid;
    }
     public String getEname(){
        return ename;
    }
     public int getEage(){
        return eage;
    }


    
    }
public class Code2{
    public static void main(String[] args){
        Employee e1 = new Employee();

        //calling setters
        e1.setEid("Raju123");
        e1.setEname("raju");
        e1.setEage(38);

        //calling getters
        System.out.println("ID of Employee is: "+e1.getEid());
        System.out.println("Name of Employee is: "+e1.getEname());
        System.out.println("Age of Employee is: "+e1.getEage());
     
    }
}