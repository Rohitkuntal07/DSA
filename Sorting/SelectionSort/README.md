# Selection Sort

## Approach
Selection Sort is a simple comparison-based sorting algorithm.  
It works by dividing the array into two parts: the **sorted part** and the **unsorted part**.  
On each pass, it selects the **smallest element** from the unsorted part and swaps it with the first element of the unsorted section, thereby growing the sorted portion one step at a time.

### Steps:
1. Start with the first element as the minimum.
2. Compare this minimum with the rest of the array to find the actual smallest element.
3. Swap the smallest element with the first element.
4. Move the boundary of the sorted and unsorted part one step forward.
5. Repeat until the array is sorted.

---

## Time Complexity
- **Best Case:** O(n²)  
- **Average Case:** O(n²)  
- **Worst Case:** O(n²)  
 Because selection sort always performs the same number of comparisons regardless of the input order.

## Space Complexity
- **O(1)** → Selection Sort is an in-place sorting algorithm.

---

## Example 1
**Input:**  
`[64, 25, 12, 22, 11]`  

**Process:**  
- Pass 1: `[11, 25, 12, 22, 64]`  
- Pass 2: `[11, 12, 25, 22, 64]`  
- Pass 3: `[11, 12, 22, 25, 64]`  
- Pass 4: `[11, 12, 22, 25, 64]`  

**Output:**  
`[11, 12, 22, 25, 64]`

---

## Example 2
**Input:**  
`[29, 10, 14, 37, 13]`  

**Output:**  
`[10, 13, 14, 29, 37]`

---
### Author 
Rohit
