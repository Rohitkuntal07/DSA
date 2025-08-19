import java.util.*;

class Main {
    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
    }
}  
