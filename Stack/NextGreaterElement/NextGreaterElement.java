import java.util.*;

// Solution class to find next greater elements
class Solution {
    // Function to find next greater elements
    public int[] nextGreater(int[] nums) {
        // Stack to store elements
        Stack<Integer> st = new Stack<>();

        // Result array of same size
        int n = nums.length;
        int[] res = new int[n];

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop all smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            // If stack is empty, no greater element
            if (st.isEmpty()) res[i] = -1;

            // Else top of stack is the answer
            else res[i] = st.peek();

            // Push current element
            st.push(nums[i]);
        }

        // Return the result
        return res;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        Solution sol = new Solution();
        int[] ans = sol.nextGreater(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
