package Basics;

public class updatingVariable {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 8;
        System.out.println(x);
        x = x + 10;
        System.out.println(x);
        x = x - 8;
        System.out.println(x);
        x = x / 2;
        System.out.println(x);
        x = x * 10;
        System.out.println(x);
        

        //updating shortcut

        //hear value of x is 50, from above.

        x += 7;
        System.out.println(x);
        
        x *= 5;
        System.out.println(x);

        //both process is same but second one is more faster than 1st.

    }
    
}
