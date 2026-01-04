 class Student{
    //data security
    private int rollNo;
    private String name;
    private String address;

    //Setter Method
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getter method
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
public class Code1{
    public static void main(String[] args){
        Student s1 = new Student();
        // calling setters
        s1.setRollNo(5);
        s1.setName("Darshan");
        s1.setAddress("Chakan");

        //calling getters
        System.out.println("Roll no is : "+s1.getRollNo());
         System.out.println("Name   is : "+s1.getName());
          System.out.println("Address is : "+s1.getAddress());

    }
}