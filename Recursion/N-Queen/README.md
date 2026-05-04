## N-Queens Problem

### Problem Statement
Place n queens on an n × n chessboard such that no two queens attack each other.  
Return all distinct board configurations using 'Q' for queens and '.' for empty spaces.

---

### Examples

Example

Input:  
n = 4

Output:  
[
[".Q..","...Q","Q...","..Q."],  
["..Q.","Q...","...Q",".Q.."]
]

Explanation:  
Each configuration represents a valid placement of 4 queens.

---

### Approach

Use backtracking with optimized checks using hash arrays.

---

### Algorithm

1. Initialize three arrays:
   - row[] for rows  
   - lowerDiagonal[] for (row + col)  
   - upperDiagonal[] for (n - 1 + col - row)  

2. Start placing queens column by column.  
3. For each column, try all rows:
   - Check if row and diagonals are free.  
4. If safe:
   - Place the queen.  
   - Mark row and diagonals as occupied.  
5. Recurse for the next column.  
6. If all columns are filled:
   - Store the board configuration.  
7. Backtrack:
   - Remove the queen.  
   - Unmark row and diagonals.  
8. Continue exploring all possibilities.

---

### Author
- Rohit
