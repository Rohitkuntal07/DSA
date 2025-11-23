# Peak Element in Array

## Problem Statement
Given an array of length **N**, a **peak element** is an element that is greater than both of its neighbors.  
Formally, `arr[i]` is a peak if:

arr[i - 1] < arr[i] and arr[i + 1] < arr[i]

Return the **index (0-based)** of any one peak element.  
If multiple peaks exist, you may return **any** of them.

---

## Examples

### Example 1
Input:  
arr = {1,2,3,4,5,6,7,8,5,1}

Output:  
7  

Explanation:  
The peak element is **8**, located at index **7**.

---

### Example 2
Input:  
arr = {1,2,1,3,5,6,4}

Output:  
1  

Explanation:  
Peak elements exist at indices **1** and **5**. Returning any one is valid.

---

### Author
Rohit
