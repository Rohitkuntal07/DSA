## Infix to Postfix

### Problem Statement
Given an infix expression, convert it into its equivalent postfix expression.

In postfix notation, operators appear after their operands, eliminating the need for parentheses and making expression evaluation easier.

---

### Examples

Example 1

Input:  
a + b * (c^d - e) ^ (f + g * h) - i

Output:  
abcd^e-fgh*+^*+i-

Explanation:  
The infix expression is converted into postfix form by following operator precedence and associativity rules.

---

Example 2

Input:  
(p + q) * (m - n)

Output:  
pq+mn-*

Explanation:  
The postfix expression preserves the order of operations without using parentheses.

---

### Approach

Use a stack to temporarily store operators and parentheses while scanning the infix expression from left to right.

Operands are directly added to the result, while operators are pushed or popped based on precedence and associativity.

---

### Operator Precedence

| Operator | Precedence |
|-----------|------------|
| ^ | 3 |
| * , / | 2 |
| + , - | 1 |

Associativity:

- ^ → Right Associative
- *, /, +, - → Left Associative

---

### Algorithm

1. Create:
   - An empty stack for operators.
   - An empty string for the postfix expression.

2. Traverse the infix expression from left to right.

3. If the current character is an operand:
   - Append it directly to the postfix expression.

4. If the current character is '(':
   - Push it onto the stack.

5. If the current character is ')':
   - Pop operators from the stack and append them to the postfix expression until '(' is encountered.
   - Remove '(' from the stack.

6. If the current character is an operator:
   - While the stack is not empty and:
     - Top has higher precedence, or
     - Top has equal precedence and current operator is left associative
   - Pop operators and append them to the postfix expression.
   - Push the current operator onto the stack.

7. After processing the entire expression:
   - Pop all remaining operators from the stack and append them to the postfix expression.

8. Return the postfix expression.

---

### Time Complexity

- O(N)

### Space Complexity

- O(N)

---

### Author
- Rohit
