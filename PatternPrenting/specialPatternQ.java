

import java.util.Scanner;

public class specialPatternQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

       //Odd number tringle

        for(int i=1;i<=n;i++){ //row
            int a=1;
           for(int j=1;j<=i;j++){ //col
                System.out.print(a + " ");
                a=a+2;
            }
            System.out.println();

            
        }

       // ************* OR *************

        // for(int i=1;i<=n;i++){ //row
        //    for(int j=1;j<=i;j++){ //col
        //         System.out.print((j*2)-1 + " ");
                
        //     }
        //     System.out.println();

            
        }
    }

    
    

    

