class Solution {
    // Function to check if a number is odd
    public boolean isOdd(int n) {
        return n % 2 != 0;  // Return true if the number is odd, else false
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 7;

        if (sol.isOdd(num)) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is not odd.");
        }
    }
}
