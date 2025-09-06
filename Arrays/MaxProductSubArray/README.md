# Maximum Product Subarray

## Problem Statement
Given an array `arr[]` that contains positive and negative integers (it may also contain `0`).  
Find the maximum product that can be obtained from a subarray of `arr[]`.

It is guaranteed that the answer fits in a 32-bit integer.

---

## Examples

**Example 1:**
Input: arr[] = [-2, 6, -3, -10, 0, 2]<br>
Output: 180<br>
Explanation: The subarray with maximum product is [6, -3, -10]<br>
with product = 6 * (-3) * (-10) = 180.<br>

**Example 2:**
Input: arr[] = [-1, -3, -10, 0, 6]<br>
Output: 30<br>
Explanation: The subarray with maximum product is [-3, -10]<br>
with product = (-3) * (-10) = 30.<br>

**Example 3:**
Input: arr[] = [2, 3, 4]<br>
Output: 24<br>
Explanation: The result is product of all elements = 2 * 3 * 4 = 24.<br>

---

## Constraints
- 1 ≤ arr.size() ≤ 10^6  
- -10 ≤ arr[i] ≤ 10  

---

### Author
Rohit
