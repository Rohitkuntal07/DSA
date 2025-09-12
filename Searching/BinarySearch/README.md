# Binary Search Algorithm

## Introduction
Binary Search is an efficient searching algorithm that works on **sorted arrays**.  
It repeatedly divides the search interval in half and eliminates half of the elements until the target is found or the search interval becomes empty.

---

## Approach
1. Start with two pointers: `low = 0` and `high = n-1`.
2. Find the middle index: `mid = (low + high) / 2`.
3. Compare the middle element with the target:
   - If `arr[mid] == target`, return the index.
   - If `arr[mid] > target`, search in the left half (`high = mid - 1`).
   - If `arr[mid] < target`, search in the right half (`low = mid + 1`).
4. Repeat until `low > high`.
5. If no match is found, return -1.

⚠️ **Note:** Binary Search only works on **sorted arrays**.

---
## Time Complexity
- **Best Case:** `O(1)` → When the middle element is the target.
- **Worst Case:** `O(log n)` → Search space reduces by half each step.
- **Average Case:** `O(log n)`.

## Space Complexity
- **O(1)** → Iterative implementation.  
- **O(log n)** → Recursive implementation due to stack calls.
---
## Examples

### Example 1
**Input:**  
arr = [10, 20, 30, 40, 50], target = 30  

**Process:**  
- low=0, high=4 → mid=2 → arr[2]=30 → found  

**Output:**  
`Element found at index 2`

---

### Example 2
**Input:**  
arr = [5, 15, 25, 35, 45], target = 50  

**Process:**  
- low=0, high=4 → mid=2 → arr[2]=25 < 50 → search right  
- low=3, high=4 → mid=3 → arr[3]=35 < 50 → search right  
- low=4, high=4 → mid=4 → arr[4]=45 < 50 → search right  
- low=5, high=4 → stop → not found  

**Output:**  
`Element not found`

---

### Example 3
**Input:**  
arr = [7, 14, 21, 28, 35], target = 7  

**Process:**  
- low=0, high=4 → mid=2 → arr[2]=21 > 7 → search left  
- low=0, high=1 → mid=0 → arr[0]=7 → found  

**Output:**  
`Element found at index 0`

---
### Author
Rohit
