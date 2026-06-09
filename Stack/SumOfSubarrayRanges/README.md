## Sum of Subarray Ranges

### Problem Statement

Given an integer array `nums`, determine the range of a subarray, defined as:

```text
Range = Maximum Element - Minimum Element
```

Return the sum of ranges of all possible non-empty subarrays.

A subarray is a contiguous sequence of elements within the array.

---

### Examples

#### Example 1

**Input:**

```text
nums = [1, 2, 3]
```

**Output:**

```text
4
```

**Explanation:**

Subarrays:

```text
[1]       -> 1 - 1 = 0
[2]       -> 2 - 2 = 0
[3]       -> 3 - 3 = 0
[1,2]     -> 2 - 1 = 1
[2,3]     -> 3 - 2 = 1
[1,2,3]   -> 3 - 1 = 2
```

Total:

```text
0 + 0 + 0 + 1 + 1 + 2 = 4
```

---

#### Example 2

**Input:**

```text
nums = [1, 3, 3]
```

**Output:**

```text
4
```

**Explanation:**

Subarrays:

```text
[1]       -> 0
[3]       -> 0
[3]       -> 0
[1,3]     -> 2
[3,3]     -> 0
[1,3,3]   -> 2
```

Total:

```text
4
```

---

## Brute Force Approach

### Idea

Generate all possible subarrays.

For every subarray:

- Find the minimum element.
- Find the maximum element.
- Add:

```text
max - min
```

to the answer.

### Time Complexity

```text
O(N²)
```

### Space Complexity

```text
O(1)
```

---

## Optimal Approach (Monotonic Stack)

### Intuition

Instead of calculating the range for every subarray separately:

```text
Range = Maximum Contribution - Minimum Contribution
```

We calculate:

```text
Sum of Subarray Maximums
-
Sum of Subarray Minimums
```

For every element:

```text
Contribution =
Element × Number of subarrays where it is maximum/minimum
```

To find these counts efficiently, use monotonic stacks.

---

## Required Arrays

### For Minimum Contribution

1. PSEE (Previous Smaller or Equal Element)
2. NSE (Next Smaller Element)

### For Maximum Contribution

1. PGEE (Previous Greater or Equal Element)
2. NGE (Next Greater Element)

---

## Contribution Formula

### Minimum Contribution

For index i:

```text
left = i - PSEE[i]
right = NSE[i] - i

Contribution =
nums[i] × left × right
```

---

### Maximum Contribution

For index i:

```text
left = i - PGEE[i]
right = NGE[i] - i

Contribution =
nums[i] × left × right
```

---

## Algorithm

### Step 1

Find NSE for every element.

```text
Next Smaller Element
```

using a monotonic increasing stack.

---

### Step 2

Find PSEE for every element.

```text
Previous Smaller or Equal Element
```

using a monotonic increasing stack.

---

### Step 3

Find NGE for every element.

```text
Next Greater Element
```

using a monotonic decreasing stack.

---

### Step 4

Find PGEE for every element.

```text
Previous Greater or Equal Element
```

using a monotonic decreasing stack.

---

### Step 5

Compute total minimum contribution:

```text
sumMin += nums[i] *
          (i - PSEE[i]) *
          (NSE[i] - i)
```

---

### Step 6

Compute total maximum contribution:

```text
sumMax += nums[i] *
          (i - PGEE[i]) *
          (NGE[i] - i)
```

---

### Step 7

Return:

```text
sumMax - sumMin
```

---

## Why It Works?

For every element:

```text
Left Choices  = distance to previous boundary
Right Choices = distance to next boundary
```

Therefore:

```text
Total Subarrays
=
Left Choices × Right Choices
```

where that element acts as:

- Minimum (using NSE + PSEE)
- Maximum (using NGE + PGEE)

---

## Time Complexity

```text
O(N)
```

Each stack operation is performed at most once.

## Space Complexity

```text
O(N)
```

For NSE, PSEE, NGE, PGEE arrays and stacks.

---

### Author
- Rohit
