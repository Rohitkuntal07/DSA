# 4Sum (LeetCode-style)

## Problem
Given an array `nums` of n integers, return all unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:
- 0 <= a, b, c, d < n
- a, b, c, and d are distinct
- nums[a] + nums[b] + nums[c] + nums[d] == target

## Example
Input: nums = [1,0,-1,0,-2,2], target = 0  
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

## Approach
1. Sort the array.
2. Use two nested loops to fix the first two elements, then apply two-pointer technique for the remaining two.
3. Skip duplicates for all four positions to ensure unique quadruplets.
4. Use 64-bit arithmetic for sum checks to avoid overflow.

## Complexity
- Time: O(n^3) worst-case due to two nested loops plus two-pointer scan.
- Space: O(k) for the output where k is number of quadruplets (plus O(1) extra).

---

### Author
Rohit
