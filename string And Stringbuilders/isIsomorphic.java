import java.util.Scanner;

public class isIsomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] a = new char[128];
        if (s.length()==t.length()) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                char dh = t.charAt(i);
                int idx = (int)ch;
                if (a [idx]=='\0') {
                    a[idx]=dh;  
                    System.out.println("true");
                }
                else if (a[idx]!='\0') {
                    System.out.println("false");
                } 

                
            }
        }
        System.out.println("false");  //theit is code farther more for different codition of words 
                                      //but i am not writing it now.
       

    }
    
}
