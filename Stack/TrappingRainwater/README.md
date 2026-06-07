## Trapping Rainwater

### Problem Statement

Given an array `height` representing the elevation map where the width of each bar is 1, compute how much water can be trapped after raining.

---

### Examples

#### Example 1

**Input:**
```text
height = [0,1,0,2,1,0,1,3,2,1,2,1]
```

**Output:**
```text
6
```

**Explanation:**

Water trapped at each position:

- Index 2 → 1 unit
- Index 4 → 1 unit
- Index 5 → 2 units
- Index 6 → 1 unit
- Index 9 → 1 unit

Total = 6 units.

---

#### Example 2

**Input:**
```text
height = [4,2,0,3,2,5]
```

**Output:**
```text
9
```

**Explanation:**

The bars form valleys that can hold a total of 9 units of water.

---

## Brute Force Approach

### Idea

For every index:

- Find the tallest bar on its left.
- Find the tallest bar on its right.
- Water trapped at current index:

```text
min(leftMax, rightMax) - height[i]
```

Add this value for all indices.

### Time Complexity

```text
O(N²)
```

### Space Complexity

```text
O(1)
```

---

## Optimal Approach (Two Pointers)

### Intuition

The amount of water trapped at any position depends on:

```text
min(maxLeft, maxRight) - currentHeight
```

Instead of precomputing left and right maximum arrays, use two pointers and maintain:

- maxLeft
- maxRight

At every step:

- If `height[left] <= height[right]`, the left side determines the trapped water.
- Otherwise, the right side determines the trapped water.

This allows computation in a single traversal with constant extra space.

---

### Algorithm

1. Initialize:
   - left = 0
   - right = n - 1
   - maxLeft = 0
   - maxRight = 0
   - totalWater = 0

2. While `left <= right`:

   **Case 1:**

   If `height[left] <= height[right]`:

   - If `height[left] >= maxLeft`
     - Update `maxLeft`

   - Else:
     ```text
     water = maxLeft - height[left]
     ```
     Add water to `totalWater`

   - Move `left++`

   **Case 2:**

   Otherwise:

   - If `height[right] >= maxRight`
     - Update `maxRight`

   - Else:
     ```text
     water = maxRight - height[right]
     ```
     Add water to `totalWater`

   - Move `right--`

3. Return `totalWater`.

---

### Dry Run

**Input:**

```text
height = [4,2,0,3,2,5]
```

**Process:**

```text
maxLeft = 4

At height 2 -> water = 2
At height 0 -> water = 4
At height 3 -> water = 1
At height 2 -> water = 2
```

**Total:**

```text
2 + 4 + 1 + 2 = 9
```

**Output:**

```text
9
```

---

### Time Complexity

```text
O(N)
```

### Space Complexity

```text
O(1)
```

--- 

### Author
- Rohit
