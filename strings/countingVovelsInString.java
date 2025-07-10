
import java.util.Scanner;


public class countingVovelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
       int sum = 0;
       so
       
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if(j=='a' || j=='A') sum++;
            if (j=='e' ||j=='E' ) sum++;
            if(j=='i' || j=='I') sum++;
            if(j=='o' || j=='O') sum++;
            if(j=='u' || j=='U') sum++;
      
        }
        System.out.print("Number of vovels in the given string is " + sum);
                 

        BAGHUN TYPE KAR LAVDYA
        
    }
    
}
