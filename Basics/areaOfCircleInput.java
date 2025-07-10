package Basics;
import java.util.Scanner;
public class areaOfCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius :");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println(a);
    }
    
}


