# Majority Element - More Than n/3


## Problem Statement
Given an array `arr[]` of size `n`, find all elements that occur **more than ⌊n/3⌋ times**. The returned list should be sorted in ascending order.


### Constraints
- 1 ≤ n ≤ 10^6
- -10^5 ≤ arr[i] ≤ 10^5


---


## Approaches


###  HashMap Counting (Simpler)**
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- Count frequencies with a map, then pick elements with frequency > n/3.

## Example
### Input
```
8
2 2 3 1 3 2 1 1
```
### Output
```
[1, 2]
```


### Explanation
- `1` occurs 3 times, `2` occurs 3 times.
- n/3 = 8/3 = 2. Both exceed this frequency, so `[1, 2]` is returned.
---

### Author
Rohit
