## M-Coloring Problem

### Problem Statement
Given an undirected graph and an integer m, determine whether the graph can be colored using at most m colors such that no two adjacent vertices have the same color.

---

### Examples

Example 1

Input:  
N = 4  
M = 3  
Edges = {  
(0,1),  
(1,2),  
(2,3),  
(3,0),  
(0,2)  
}

Output:  
1

Explanation:  
The graph can be colored using 3 colors.

---

Example 2

Input:  
N = 3  
M = 2  
Edges = {  
(0,1),  
(1,2),  
(0,2)  
}

Output:  
0

Explanation:  
The graph forms a triangle and requires at least 3 colors.

---

### Approach

Use backtracking to try assigning colors to each node.

---

### Algorithm

1. Start coloring nodes from index 0.  
2. Try every color from 1 to m for the current node.  
3. Use an isSafe function to check:
   - No adjacent node has the same color.  
4. If safe:
   - Assign the color to the node.  
   - Recurse for the next node.  
5. If recursion succeeds, return true.  
6. Otherwise, backtrack by removing the color.  
7. If no color works for a node, return false.  
8. If all nodes are colored successfully, return true.

---

### Author
- Rohit
