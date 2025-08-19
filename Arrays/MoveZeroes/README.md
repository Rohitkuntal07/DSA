# Move All Zeroes to End

## Problem Description
You are given an array `arr[]` of non-negative integers.  
Your task is to move all the zeros in the array to the **right end** while maintaining the relative order of the non-zero elements.  

The operation must be performed **in-place**, meaning you should not use extra space for another array.

---

## Input Format
- An array `arr[]` of non-negative integers.

## Output Format
- The modified array with all zeros moved to the end.

---

## Constraints
- 1 ≤ `arr.length` ≤ 10⁵  
- 0 ≤ `arr[i]` ≤ 10⁵  

---

## Examples

### Example 1
**Input**  
arr = [1, 2, 0, 4, 3, 0, 5, 0]

**Output**  
[1, 2, 4, 3, 5, 0, 0, 0]

**Explanation**  
There are three `0`s that are moved to the end.

---

### Example 2
**Input**  
arr = [10, 20, 30]

**Output**  
[10, 20, 30]

**Explanation**  
No change since there are no zeros.

---
## Approach
We use a **two-pointer method**:
1. Keep a pointer `pos` that marks the position for the next non-zero element.
2. Traverse the array:
   - If the element is non-zero, swap it with `arr[pos]` and increment `pos`.
3. At the end, all non-zero elements will be in their original order, and all zeros will be shifted to the end.

---
### Author
Rohit
