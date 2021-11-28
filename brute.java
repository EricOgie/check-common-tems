import java.lang.System.Logger;

class Brute {
    // Results to a run time complexityof O(n^2)
    private static boolean checkCommonItems(int[] array1, int[] array2) {
        for (int x = 0; x < array1.length; x++) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[x] == array2[i]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 7, 8, 9 };

        System.out.println(checkCommonItems(arr1, arr2));
    }

}