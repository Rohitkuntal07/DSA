# 3 Sum – Find Triplets That Add Up to Zero

## Problem Statement
Given an integer array `nums` of size **N**, return **all unique triplets** `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `j != k`, `k != i`
- `nums[i] + nums[j] + nums[k] == 0`

No duplicate triplets should be included in the output.

---

## Examples

### Example 1
**Input**  
nums = [-1,0,1,2,-1,-4]

**Output**  
[[-1,-1,2], [-1,0,1]]

---

### Example 2
**Input**  
nums = [-1,0,1,0]

**Output**  
[[-1,0,1]]

---

## Approach (Two Pointer Technique)

1. **Sort** the array.
2. Loop through the array with index `i`.
3. For each `i`, use **two pointers** (`left`, `right`) to find pairs such that: nums[i] + nums[left] + nums[right] == 0
4. Skip duplicates for `i`, `left`, and `right` to avoid repeated triplets.
5. Return the list of unique triplets.

---

## Time & Space Complexity
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(k)` where `k` = number of valid triplets.

---

### Author
Rohit
