import java.util.Scanner;
public class stairPath {
    public static int ways(int n){
     int ans;
     if(n==1 || n==2){
        return n;
     }
     else{
        ans = ways(n-1) + ways(n-2);
     }
     return ans;
    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the nth stair: ");
      int n = sc.nextInt();
      System.out.println(ways(n));
      
    }
}