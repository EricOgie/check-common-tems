
import java.util.HashMap;

public class better {

    // This solution gives O(n + m) time complexity. Obviously better than than the
    // brute approach.
    private static boolean checkCommonItems(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> vals1 = new HashMap<>();
        for (int val : array1) {
            vals1.put(val, true);
        }

        for (int val2 : array2) {
            if (vals1.containsKey(val2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 7, 8, 9, 5 };
        System.out.println(checkCommonItems(arr1, arr2));
    }
}
