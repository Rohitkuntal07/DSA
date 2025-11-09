# Set Matrix Zeroes

**Difficulty:** Medium  
**Topic:** Arrays, Matrix, In-place

## Problem
Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`. Do it **in-place**.

### Examples
**Input:** `[[1,1,1],[1,0,1],[1,1,1]]`  
**Output:** `[[1,0,1],[0,0,0],[1,0,1]]`

**Input:** `[[0,1,2,0],[3,4,5,2],[1,3,1,5]]`  
**Output:** `[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`

## Approaches

### 1) Brute Force (Not in-place friendly)
- Scan the matrix; store rows and columns containing `0` in extra sets/lists.
- Second pass: zero out marked rows/columns.
- **Space:** `O(m + n)`  
- **Time:** `O(mn)`

### 2) Optimal In-Place (Marker Trick) ✅
Use the **first row and first column** as marker arrays:
1. Check whether the first row and first column themselves need to be zeroed (two booleans).
2. For each cell `(i, j)` where `i > 0` and `j > 0`, if `matrix[i][j] == 0`, mark `matrix[i][0] = 0` and `matrix[0][j] = 0`.
3. Second pass (excluding first row/col): if the row or column is marked, set `matrix[i][j] = 0`.
4. Finally zero the first row/column based on the booleans.

**Time Complexity:** `O(mn)`  
**Space Complexity:** `O(1)` extra space

### Edge Cases
- Single row or single column.
- All zeros or no zeros.
- Zeros in the first row/first column (handled via booleans).
- Large matrices (ensure in-place and `O(1)` extra space).

---
### Author
Rohit

