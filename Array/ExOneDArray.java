
public class ExOneDArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 34, 56, 78, 43, 23}; // Corrected array declaration and initialization
        int max = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > max) {
                max = arr[idx];
            }
        }
        System.out.println(max);
    }
}
