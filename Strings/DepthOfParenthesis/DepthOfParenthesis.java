class Solution {
    // Method to compute maximum depth of parentheses
    public int maxDepth(String s) {
        int p = 0; 
        int ans = 0; 
        for (char ch : s.toCharArray()) {
            // Increase depth on open parenthesis
            if (ch == '(') p++;
            // Decrease depth on close parenthesis
            else if (ch == ')') p--;
            // Update maximum depth encountered
            ans = Math.max(ans, p);
        }
        return ans; 
    }
}

// Main class to test the function
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}
