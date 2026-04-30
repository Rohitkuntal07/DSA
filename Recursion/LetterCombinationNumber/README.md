## Letter Combinations of a Phone Number

### Problem Statement
Given a string of digits from 2 to 9, return all possible letter combinations that the number can represent.

---

### Examples

Example 1

Input:  
digits = "34"

Output:  
["dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi"]

Explanation:  
Digit 3 maps to "def" and 4 maps to "ghi".  
All combinations are formed by pairing letters.

---

Example 2

Input:  
digits = "3"

Output:  
["d", "e", "f"]

Explanation:  
Digit 3 maps to "def".

---

### Approach

Use backtracking with a mapping of digits to letters.

---

### Algorithm

1. Create a mapping from digits (2–9) to corresponding letters.  
2. Initialize an empty result list.  
3. Define a recursive function with parameters (index, current_string).  
4. If index == length of digits:
   - Add current_string to the result.  
5. Get the letters corresponding to the current digit.  
6. For each letter:
   - Append it to current_string.  
   - Recurse for the next index.  
   - Backtrack by removing the letter.  
7. Return all combinations.

---

### Author
- Rohit
