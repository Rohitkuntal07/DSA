## Check if One String is a Rotation of Another

### Problem Statement
Given two strings, s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.  
For example, if s = "abcde", then it becomes "bcdea" after one shift.

---

### Examples

Example 1

Input:  
s = "rotation", goal = "tionrota"

Output:  
true

Explanation:  
After multiple left shifts on "rotation", we get:  
1st shift → "otationr"  
2nd shift → "tationro"  
3rd shift → "ationrot"  
4th shift → "tionrota"  

So the goal string can be obtained by rotating the original string.

---

Example 2

Input:  
s = "hello", goal = "lohelx"

Output:  
false

Explanation:  
Even after all possible rotations of "hello", we cannot form "lohelx" due to the presence of an extra character 'x'. Hence, it is not possible.

---

### Author
- Rohit
