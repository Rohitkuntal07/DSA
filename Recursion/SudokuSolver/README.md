## Sudoku Solver

### Problem Statement
Given a Sudoku board containing empty cells represented by '.', fill the board so that it becomes a valid Sudoku solution.

Rules:
1. Each row must contain digits 1 to 9 exactly once.  
2. Each column must contain digits 1 to 9 exactly once.  
3. Each 3x3 sub-grid must contain digits 1 to 9 exactly once.  

---

### Examples

Example 1

Input:  
Sudoku board with empty cells represented by '.'

Output:  
A valid completed Sudoku board

Explanation:  
All empty cells are filled while satisfying Sudoku rules.

---

Example 2

Input:  
Another partially filled Sudoku board

Output:  
One valid solved Sudoku configuration

Explanation:  
The board is solved using valid placements.

---

### Approach

Use backtracking to try placing numbers in empty cells.

---

### Algorithm

1. Traverse the Sudoku board cell by cell.  
2. If an empty cell '.' is found:
   - Try placing digits from 1 to 9.  
3. For each digit:
   - Check if placing it is valid:
     - Not present in the same row  
     - Not present in the same column  
     - Not present in the same 3x3 sub-grid  
4. If valid:
   - Place the digit.  
   - Recurse for the next empty cell.  
5. If recursion succeeds, return true.  
6. Otherwise:
   - Remove the digit (backtrack).  
7. If no digit works, return false.  
8. When all cells are filled, the Sudoku is solved.

---

### Author
- Rohit
