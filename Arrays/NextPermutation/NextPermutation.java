import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) j--;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int start = i + 1, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
