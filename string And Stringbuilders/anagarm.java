import java.util.Arrays;

public class anagarm {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
