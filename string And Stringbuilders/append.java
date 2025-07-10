public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        sb.append("skb");
        System.out.println(sb);
        char[] ch = {'m','l','o'};
        sb.append(ch);
        System.out.println(sb);
        sb.append(275);
        System.out.println(sb);

    }
    
}
