import java.util.Scanner;
public class powerLinear{
    public static int power(int a,int b){
        int ans;
        if(b==0){
            return 1;  // this is base case
        }
        else{
            ans = a * power(a,b-1);  //this is formula where (a^b=a*a*a*a*...a) b times
                                    //a^b= a * a*a*a*a..a 
                                    //           ---------- (b-1) time
        }
        return ans;
    }
     

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
