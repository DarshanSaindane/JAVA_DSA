import java.util.*;

public class FindAllMissingNoInArray {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<Integer> Find(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int ele = arr[i];
            if (arr[i] == i + 1) {
                i++;
            } else if (ele > 0 && ele <= n && arr[i] != arr[ele - 1]) {
                swap(i, ele - 1, arr);
            } else {
                i++;
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                missing.add(i + 1);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 7};
        List<Integer> result = Find(arr);
        System.out.println("Missing numbers: " + result);
    }
}
