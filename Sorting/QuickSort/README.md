# 🌀 Quick Sort

## 🧩 Problem Statement  
Given an unsorted array of integers, sort the array in **ascending order** using the **Quick Sort algorithm**.  
Quick Sort follows the **divide and conquer** approach — selecting a pivot element, partitioning the array around the pivot, and recursively sorting the partitions.

---

## ⚙️ Algorithm  
1. **Choose a pivot** element (typically the last element).  
2. **Partition** the array:  
   - Move all elements smaller than or equal to the pivot to its left.  
   - Move all greater elements to its right.  
3. **Recursively** apply steps 1–2 to the subarrays on both sides of the pivot.  
4. Combine the results to get a fully sorted array.

---

## 🧠 Time Complexity  
| Case | Complexity |
|------|-------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

---

## 🧮 Space Complexity  
O(log n) — for the recursive call stack.

---

## 💻 Example  
**Input:**  
`arr = [10, 7, 8, 9, 1, 5]`  

**Output:**  
`[1, 5, 7, 8, 9, 10]`

---

### Author
Rohit
