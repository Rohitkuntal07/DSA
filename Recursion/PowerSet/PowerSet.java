import java.util.*;

// Solution class to generate all subsequences using recursion
class Solution {
    // Helper recursive method to generate subsequences
    private void helper(String s, int index, StringBuilder current, List<String> result) {
        // Base case: if index reaches string length, add current subsequence to result
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }

        // Exclude current character and recurse
        helper(s, index + 1, current, result);

        // Include current character and recurse
        current.append(s.charAt(index));
        helper(s, index + 1, current, result);

        // Backtrack by removing last character
        current.deleteCharAt(current.length() - 1);
    }

    // Method to return all subsequences of string s
    public List<String> getSubsequences(String s) {
        // List to store all subsequences
        List<String> result = new ArrayList<>();

        // StringBuilder to store current subsequence
        StringBuilder current = new StringBuilder();

        // Start recursion from index 0
        helper(s, 0, current, result);

        // Return list of subsequences
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        // Input string
        String s = "abc";

        // Create Solution object
        Solution sol = new Solution();

        // Get all subsequences
        List<String> subsequences = sol.getSubsequences(s);

        // Print all subsequences
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
