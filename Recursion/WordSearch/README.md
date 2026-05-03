## Word Search

### Problem Statement
Given an m x n grid of characters and a word, return true if the word exists in the grid.  
The word can be formed by sequentially adjacent cells (horizontal or vertical).  
A cell cannot be used more than once.

---

### Examples

Example 1

Input:  
board = [["A","B","C","E"],  
         ["S","F","C","S"],  
         ["A","D","E","E"]],  
word = "ABCCED"

Output:  
true

Explanation:  
The word can be formed by traversing adjacent cells.

---

Example 2

Input:  
board = [["A","B","C","E"],  
         ["S","F","C","S"],  
         ["A","D","E","E"]],  
word = "ABCB"

Output:  
false

Explanation:  
The word cannot be formed without reusing a cell.

---

### Approach

Use backtracking (DFS) to explore all possible paths.

---

### Algorithm

1. Traverse each cell in the grid.  
2. If the cell matches the first character of the word, start DFS.  
3. In DFS:
   - Check boundaries and character match.  
   - If all characters are matched, return true.  
   - Mark the cell as visited.  
   - Explore all four directions (up, down, left, right).  
4. Backtrack by restoring the cell.  
5. If no path matches, return false.

--- 

 ### Author
 - Rohit
