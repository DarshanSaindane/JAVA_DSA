public class Problem {
    public static void pD(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        pD(n-1);
    }

    public static void pI(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        pI(n-1);
        System.out.println(n);
    }

    public static int sumN(int n){
        int sum;
        if(n==1){
           return 1;
        }
        else{
            sum = n + sumN(n-1);
        }
        return sum;
    }

    public static int fB(int n){
        int ans;
        if(n==1 || n==0){
            return n;
        }
        else{
            ans = fB(n-1) + fB(n-2);
        }
        return ans;
    }
    public static void stringTrav(int i,String s){
        if(i==s.length()) return;
        System.out.print(s.charAt(i));
        stringTrav(i+1,s);

    }

    public static void main(String[] args){
        int n = 25;
        String s = "jitendra saindane";
        stringTrav(0,s);
    }
}