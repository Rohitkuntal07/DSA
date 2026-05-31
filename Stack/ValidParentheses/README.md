## Check for Balanced Parentheses

### Problem Statement
Given a string str containing only the characters '(', ')', '{', '}', '[' and ']', determine whether the string is balanced.

A string is considered balanced if:

- Every opening bracket has a corresponding closing bracket.
- Brackets are closed in the correct order.
- Every closing bracket matches the most recent unmatched opening bracket.

Return true if the string is balanced, otherwise return false.

---

### Examples

Example 1

Input:  
str = "()[{}()]"

Output:  
true

Explanation:  
Every opening bracket has a matching closing bracket in the correct order.

---

Example 2

Input:  
str = "[(]"

Output:  
false

Explanation:  
The opening bracket '(' is closed by ']', which is not its matching pair.

---

### Approach

Use a stack to keep track of opening brackets.

Since brackets must be closed in the reverse order of opening, a stack (LIFO) is the ideal data structure.

---

### Algorithm

1. Create an empty stack.

2. Traverse each character in the string.

3. If the character is an opening bracket:
   - Push it onto the stack.
   - '(', '{', '['

4. If the character is a closing bracket:
   - If the stack is empty:
     - Return false.
   - Otherwise:
     - Check whether the top element of the stack is the corresponding opening bracket.
     - If not, return false.
     - Otherwise, pop the top element.

5. After processing the entire string:
   - If the stack is empty:
     - Return true.
   - Otherwise:
     - Return false.

---

### Time Complexity

- O(N)

### Space Complexity

- O(N)

---

### Author
- Rohit
