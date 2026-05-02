## Palindrome Partitioning

### Problem Statement
Given a string s, partition it such that every substring is a palindrome.  
Return all possible palindromic partitions.

---

### Examples

Example 1

Input:  
s = "aab"

Output:  
[["a","a","b"], ["aa","b"]]

Explanation:  
Both partitions contain only palindrome substrings.

---

Example 2

Input:  
s = "aabb"

Output:  
[["a","a","b","b"], ["aa","bb"], ["a","a","bb"], ["aa","b","b"]]

Explanation:  
All possible ways of partitioning such that each substring is a palindrome.

---

### Approach

Use backtracking to generate all possible partitions and check for palindrome substrings.

---

### Algorithm

1. Start from index 0 with an empty list.  
2. For each index, try all substrings starting from that index.  
3. Check if the substring is a palindrome:
   - If yes, add it to the current partition.  
4. Recurse for the remaining string starting from the next index.  
5. If the end of the string is reached:
   - Add the current partition to the result.  
6. Backtrack by removing the last added substring.  
7. Continue until all partitions are explored.

--- 

### Author
- Rohit
