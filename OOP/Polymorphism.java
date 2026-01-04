class Calculator{
    public void add(int a,int b){
        System.out.println("int-int argument");
    }
    public void add(float a,float b){
        System.out.println("Float-float argument");
    }
    public void add(double a,double b){
        System.out.println("double-double argument");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.add(5,6);
        c1.add(19,3.4);

    }
}