//type casting
//this is use when the one data type is given and we have to print that number into another data type 

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();                            //int data type is given  
        
        double y = (double) x;                          //we cast int x into double and then stored into y witch is also double.

        System.out.println(y/2);
    }
    
}
