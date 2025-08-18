import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        int first = -1, second = -1;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }
        return second;
    }
}
