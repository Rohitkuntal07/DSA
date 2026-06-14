## Sliding Window Maximum

### Problem Statement

Given an array of integers `arr` and an integer `k`, there is a sliding window of size `k` moving from the left of the array to the right.

For each window, find the maximum element and return all maximums.

---

### Examples

#### Example 1

**Input:**

```text
arr = [4,0,-1,3,5,3,6,8]
k = 3
```

**Output:**

```text
[4,3,5,5,6,8]
```

**Explanation:**

```text
Window             Maximum
[4  0 -1]            4
[0 -1  3]            3
[-1 3  5]            5
[3  5  3]            5
[5  3  6]            6
[3  6  8]            8
```

---

#### Example 2

**Input:**

```text
arr = [20,25]
k = 2
```

**Output:**

```text
[25]
```

---

## Brute Force Approach

### Idea

For every window:

```text
Find the maximum element by scanning all k elements.
```

Repeat for all windows.

### Time Complexity

```text
O((N-K+1) × K)
```

Worst Case:

```text
O(NK)
```

### Space Complexity

```text
O(1)
```

---

# Optimal Approach (Deque / Monotonic Queue)

## Intuition

When a window slides:

```text
[1,2,3] -> [2,3,2]
```

We unnecessarily recalculate the maximum.

Instead, we maintain a deque that stores **indices** of useful elements.

### Key Observations

1. Elements smaller than the current element can never become maximum in future windows.

2. The front of the deque should always contain the index of the maximum element.

3. Remove indices that move outside the current window.

Thus, the deque remains:

```text
Monotonically Decreasing
```

by value.

---

## Algorithm

### Step 1

Initialize:

```text
Deque dq
Result list ans
```

Deque stores indices.

---

### Step 2

Traverse the array from left to right.

For every index `i`:

---

### Remove Out-of-Window Elements

If:

```text
dq.front() <= i-k
```

remove it.

These elements no longer belong to the current window.

---

### Maintain Decreasing Order

While:

```text
dq not empty
and
arr[dq.back()] <= arr[i]
```

remove from the back.

Reason:

```text
Current element is larger,
smaller elements are useless now.
```

---

### Insert Current Index

```text
dq.push_back(i)
```

---

### Record Window Maximum

Once the first window is formed:

```text
i >= k-1
```

the maximum element is:

```text
arr[dq.front()]
```

Add it to the answer.

---

## Dry Run

### Input

```text
arr = [4,0,-1,3,5,3,6,8]
k = 3
```

### i = 0

```text
Deque = [0]
```

---

### i = 1

```text
0 < 4

Deque = [0,1]
```

---

### i = 2

```text
-1 < 0

Deque = [0,1,2]
```

Window formed:

```text
Max = arr[0] = 4
```

Answer:

```text
[4]
```

---

### i = 3

Remove smaller elements:

```text
-1 removed
0 removed
```

Deque:

```text
[0,3]
```

Remove out-of-window:

```text
0 removed
```

Deque:

```text
[3]
```

Maximum:

```text
3
```

Answer:

```text
[4,3]
```

---

### Continue

Maximums obtained:

```text
[4,3,5,5,6,8]
```

---

## Why Deque Works?

The deque always stores candidates for the maximum.

Front of deque:

```text
Largest element inside current window
```

Back of deque:

```text
Newest candidates
```

Any smaller element behind a larger incoming element can never become maximum later, so it is removed immediately.

---

## Time Complexity

```text
O(N)
```

Each index is:

```text
Inserted once
Removed once
```

Total operations are linear.

---

## Space Complexity

```text
O(K)
```

Deque stores at most `k` indices.

---

### Author
- Rohit
