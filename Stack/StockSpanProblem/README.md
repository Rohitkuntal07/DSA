## Stock Span Problem

### Problem Statement

Given an array `arr` of size `n`, where `arr[i]` represents the stock price on day `i`, calculate the **stock span** for every day.

The span of a stock’s price on a given day is defined as the maximum number of consecutive days (including the current day) immediately before it for which the stock price was less than or equal to the current day's price.

---

### Examples

#### Example 1

**Input**

```text
n = 7
arr = [120, 100, 60, 80, 90, 110, 115]
```

**Output**

```text
[1, 1, 1, 2, 3, 5, 6]
```

**Explanation**

```text
120 → span = 1

100 → previous greater = 120
span = 1

60 → previous greater = 100
span = 1

80 → covers [60,80]
span = 2

90 → covers [60,80,90]
span = 3

110 → covers [60,80,90,100,110]
span = 5

115 → covers [60,80,90,100,110,115]
span = 6
```

---

#### Example 2

**Input**

```text
n = 6
arr = [15, 13, 12, 14, 16, 20]
```

**Output**

```text
[1, 1, 1, 3, 5, 6]
```

---

# Brute Force Approach

## Idea

For every day:

- Traverse backwards.
- Count consecutive days having price less than or equal to the current price.
- Stop when a greater price is encountered.

### Time Complexity

```text
O(N²)
```

### Space Complexity

```text
O(1)
```

---

# Optimal Approach (Monotonic Stack)

## Intuition

For a stock price at index `i`, we need:

```text
Nearest Previous Greater Element
```

Let:

```text
PGE = index of previous greater element
```

Then:

```text
Span = i - PGE
```

If no previous greater element exists:

```text
Span = i + 1
```

A monotonic decreasing stack helps find the Previous Greater Element efficiently.

---

## Key Observation

Maintain a stack storing indices such that:

```text
Prices are in decreasing order
```

Before processing the current price:

```text
Remove all smaller or equal prices
```

because they can never serve as a Previous Greater Element for future indices.

---

## Algorithm

### Step 1

Initialize:

```text
Stack st
Span array span[n]
```

Store indices in the stack.

---

### Step 2

Traverse the array from left to right.

For each index `i`:

---

### Remove Smaller Elements

While:

```text
st not empty
and
arr[st.top()] <= arr[i]
```

Pop from stack.

---

### Find Previous Greater Element

#### Case 1

Stack becomes empty:

```text
No previous greater element exists
```

Span:

```text
span[i] = i + 1
```

---

#### Case 2

Stack not empty:

```text
Previous Greater Element
=
st.top()
```

Span:

```text
span[i] = i - st.top()
```

---

### Push Current Index

```text
st.push(i)
```

---

### Step 3

Return the span array.

---

## Dry Run

### Input

```text
arr = [120,100,60,80,90,110,115]
```

---

### Day 0

```text
120

Stack = []

Span = 1

Push 0
```

Stack:

```text
[120]
```

---

### Day 1

```text
100
```

Previous greater:

```text
120
```

Span:

```text
1
```

Stack:

```text
[120,100]
```

---

### Day 2

```text
60
```

Previous greater:

```text
100
```

Span:

```text
1
```

Stack:

```text
[120,100,60]
```

---

### Day 3

```text
80
```

Pop:

```text
60
```

Previous greater:

```text
100
```

Span:

```text
3 - 1 = 2
```

Stack:

```text
[120,100,80]
```

---

### Day 4

```text
90
```

Pop:

```text
80
```

Previous greater:

```text
100
```

Span:

```text
4 - 1 = 3
```

---

### Day 5

```text
110
```

Pop:

```text
90
100
```

Previous greater:

```text
120
```

Span:

```text
5 - 0 = 5
```

---

### Day 6

```text
115
```

Pop:

```text
110
```

Previous greater:

```text
120
```

Span:

```text
6 - 0 = 6
```

---

### Final Answer

```text
[1,1,1,2,3,5,6]
```

---

## Why It Works?

The stack always keeps indices of stock prices in:

```text
Strictly decreasing order
```

Therefore:

```text
Top of stack
=
Nearest Previous Greater Element
```

which directly gives the stock span.

---

## Time Complexity

```text
O(N)
```

Each index is:

```text
Pushed once
Popped at most once
```

---

## Space Complexity

```text
O(N)
```

For the stack.

---

### Author
- Rohit
