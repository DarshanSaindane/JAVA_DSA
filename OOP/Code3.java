class person{
    public String name;
    public int age;
}
class student extends person{
    public int marks;     //Instence Variable
    public String grade;
    
    //constractor (this is parameterized constractor)
    student(String name,int age,int marks,String grade){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

        //method
        public void disp(){
            System.out.println("Name of student is: "+name);
            System.out.println("age of student is: "+age);
            System.out.println("marks of student is: "+marks);
            System.out.println("Gread of student is: "+grade);
        }
}
public class Code3{
    public static void main(String[] args){
       student s1 = new student("Darshan",21,89,"o");
       s1.disp();
    }
}