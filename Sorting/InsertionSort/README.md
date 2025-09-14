# Insertion Sort

## Approach
Insertion Sort builds the sorted array one element at a time.  
It takes each element from the unsorted part and inserts it into its correct position in the sorted part of the array.  

### Steps:
1. Assume the first element is already sorted.
2. Pick the next element and compare it with elements in the sorted portion.
3. Shift all larger elements one position to the right.
4. Insert the picked element into its correct position.
5. Repeat until all elements are sorted.

---

## Time Complexity
- **Best Case:** O(n) → when the array is already sorted.  
- **Average Case:** O(n²)  
- **Worst Case:** O(n²) → when the array is sorted in reverse order.  

## Space Complexity
- **O(1)** → Insertion Sort is an in-place sorting algorithm.

---

## Example 1
**Input:**  
`[12, 11, 13, 5, 6]`  

**Process:**  
- Pass 1: `[11, 12, 13, 5, 6]`  
- Pass 2: `[11, 12, 13, 5, 6]`  
- Pass 3: `[5, 11, 12, 13, 6]`  
- Pass 4: `[5, 6, 11, 12, 13]`  

**Output:**  
`[5, 6, 11, 12, 13]`

---

## Example 2
**Input:**  
`[9, 3, 1, 5, 4]`  

**Output:**  
`[1, 3, 4, 5, 9]`

---
### Author
Rohit
