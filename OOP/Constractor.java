
public class Constractor {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Darshan");

    }
}

class Student {
    String name;
    int roll;

    Student(){           //this is the non parametarized constructor
        System.out.println("Constructor is called...");
    }

    Student(String name){  //this is parametarized constructor.
        this.name=name;
    }
}