## Word Break

### Problem Statement
Given a string s and a dictionary of words wordDict, return true if s can be segmented into a sequence of one or more dictionary words. Otherwise, return false.

---

### Examples

Example 1

Input:  
s = "takeuforward"  
wordDict = ["take", "forward", "you", "u"]

Output:  
true

Explanation:  
The string can be segmented as "take" + "u" + "forward".

---

Example 2

Input:  
s = "applepineapple"  
wordDict = ["apple"]

Output:  
false

Explanation:  
The string cannot be completely segmented using only dictionary words.

---

### Approach

Use Dynamic Programming (DP) to check whether substrings can be segmented using dictionary words.

---

### Algorithm

1. Store all dictionary words in a set for fast lookup.  
2. Create a boolean array dp of size n + 1.  
3. Set dp[0] = true because an empty string is always valid.  
4. For each position i from 1 to n:
   - Check all possible previous positions j.  
   - If dp[j] is true and substring s[j:i] exists in the dictionary:
     - Mark dp[i] = true.  
     - Break the loop.  
5. Return dp[n] as the final result.

---

### Author
- Rohit
