## Expression Add Operators

### Problem Statement
Given a string num containing only digits and an integer target, return all possible expressions by inserting '+', '-', or '*' between the digits such that the expression evaluates to the target value.

Numbers in the expression should not contain leading zeros.

---

### Examples

Example 1

Input:  
num = "123", target = 6

Output:  
["1*2*3", "1+2+3"]

Explanation:  
Both expressions evaluate to 6.

---

Example 2

Input:  
num = "232", target = 8

Output:  
["2*3+2", "2+3*2"]

Explanation:  
Both expressions evaluate to 8.

---

### Approach

Use backtracking with DFS to generate all valid expressions.

---

### Algorithm

1. Start recursion from index 0 with:
   - current expression = ""  
   - current value = 0  
   - previous operand = 0  

2. At each step:
   - Generate all possible substrings from the current index.  
   - Skip numbers with leading zeros.  

3. For the first number:
   - Add it directly to the expression.  

4. For remaining numbers:
   - Try '+' operator:
     - Add current number to expression and value.  
   - Try '-' operator:
     - Subtract current number from value.  
   - Try '*' operator:
     - Remove previous operand from current value.  
     - Multiply previous operand with current number.  
     - Add the result back to maintain operator precedence.  

5. If the end of the string is reached:
   - Check if current value equals target.  
   - If yes, store the expression.  

6. Return all valid expressions.

---

### Author
- Rohit
