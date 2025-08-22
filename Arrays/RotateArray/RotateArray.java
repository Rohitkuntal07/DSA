import java.util.*;

public class RotateArray {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        if (d == 0) return;

        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }
}
