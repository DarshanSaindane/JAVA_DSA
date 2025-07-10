public class insertionAndDeletion {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jshodbjwv");
        System.out.println(sb);
        sb.insert(2,44);
        System.out.println(sb);

        // Now for delete
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
    }
    
}
