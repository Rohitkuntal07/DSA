## Add Two Numbers Represented as Linked Lists

### Problem Statement
Add two numbers represented as linked lists and return the result as a linked list.

---

### Examples

Example 1

Input:  
num1 = 243, num2 = 564  

Output:  
[7,0,8]

Explanation:  
Digits are stored in reverse order.  
So numbers become 342 + 465 = 807.

---

Example 2

Input:  
l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]

Output:  
[8,9,9,9,0,0,0,1]

Explanation:  
Digits are stored in reverse order.  
So numbers become 9999999 + 9999 = 10009998.

---

### Approach

Traverse both lists, add digits along with carry, and build a new list.

---

### Algorithm

1. Create a dummy node to store the result.  
2. Initialize a pointer temp to the dummy node and carry = 0.  
3. Traverse both linked lists until both are null and carry is 0.  
4. At each step:
   - Add values from both nodes (if present) and carry.  
   - Update carry = sum / 10.  
   - Create a new node with value (sum % 10).  
   - Move temp to the new node.  
5. Move both list pointers forward.  
6. Return dummy.next as the head of the result list.

--- 

### Author
- Rohit
