## Rat in a Maze

### Problem Statement
Given an n x n grid, a rat starts at (0, 0) and wants to reach (n-1, n-1).  
The rat can move in four directions: U (up), D (down), L (left), R (right).  

- 0 → blocked cell  
- 1 → open cell  

Return all possible paths from source to destination.

---

### Examples

Example 1

Input:  
n = 4  
grid = [[1,0,0,0],  
        [1,1,0,1],  
        [1,1,0,0],  
        [0,1,1,1]]

Output:  
["DDRDRR", "DRDDRR"]

Explanation:  
There are two valid paths from (0,0) to (3,3).

---

Example 2

Input:  
n = 2  
grid = [[1,0],  
        [1,0]]

Output:  
[]

Explanation:  
No valid path exists.

---

### Approach

Use backtracking to explore all possible paths while marking visited cells.

---

### Algorithm

1. If the starting cell (0,0) is blocked, return empty result.  
2. Initialize a visited matrix.  
3. Start from (0,0) with an empty path string.  
4. Try all directions in lexicographical order (D, L, R, U).  
5. For each move:
   - Check boundaries and if the cell is not blocked or visited.  
   - Mark the cell as visited.  
   - Append direction to path and recurse.  
6. If destination (n-1, n-1) is reached:
   - Add the path to result.  
7. Backtrack:
   - Unmark the cell as visited.  
   - Remove last direction from path.  
8. Return all valid paths.

---

### Author
- Rohit
