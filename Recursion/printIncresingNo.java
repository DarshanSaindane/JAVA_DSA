// import java.util.Scanner;

// public class printIncresingNo {
//     static int n;
//     public static void print(int x){
//         if(x>n) return;
//         System.out.println(x);
//         print(x+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//          n = sc.nextInt();
//         print(1);
//     }
// }
      
       //Another method By using Extra variable (In parameter)

       import java.util.Scanner;

public class printIncresingNo {
    public static void print(int x, int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        print(1,n);
    }
}