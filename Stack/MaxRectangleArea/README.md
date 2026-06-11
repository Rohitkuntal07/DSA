## Maximum Rectangle Area with all 1's

### Problem Statement

Given an `m × n` binary matrix consisting of `0`s and `1`s, find the area of the largest rectangle containing only `1`s.

Return the maximum area.

---

### Examples

#### Example 1

**Input:**

```text
matrix =
[
 [1,0,1,0,0],
 [1,0,1,1,1],
 [1,1,1,1,1],
 [1,0,0,1,0]
]
```

**Output:**

```text
6
```

**Explanation:**

The largest rectangle containing only `1`s has:

```text
Height = 2
Width  = 3

Area = 2 × 3 = 6
```

---

#### Example 2

**Input:**

```text
matrix =
[
 [1]
]
```

**Output:**

```text
1
```

**Explanation:**

Only one rectangle exists with area `1`.

---

## Approach

### Intuition

This problem can be reduced to:

```text
Largest Rectangle in Histogram
```

For every row, build a histogram where:

```text
height[j]
=
number of consecutive 1's
ending at current row
```

Then compute the largest rectangle area in that histogram.

The maximum among all rows will be the answer.

---

## Histogram Construction

Consider:

```text
matrix =
[
 [1,0,1,0,0],
 [1,0,1,1,1],
 [1,1,1,1,1],
 [1,0,0,1,0]
]
```

### Row 1

```text
[1,0,1,0,0]
```

Histogram:

```text
[1,0,1,0,0]
```

---

### Row 2

```text
[1,0,1,1,1]
```

Histogram:

```text
[2,0,2,1,1]
```

---

### Row 3

```text
[1,1,1,1,1]
```

Histogram:

```text
[3,1,3,2,2]
```

---

### Row 4

```text
[1,0,0,1,0]
```

Histogram:

```text
[4,0,0,3,0]
```

---

For every histogram:

```text
Calculate Largest Rectangle in Histogram
```

and keep the maximum area.

---

## Algorithm

### Step 1

Create a height array of size equal to the number of columns.

Initially:

```text
height[j] = 0
```

---

### Step 2

Traverse the matrix row by row.

For every cell:

```text
If matrix[i][j] == 1
    height[j]++

Else
    height[j] = 0
```

This builds the histogram for the current row.

---

### Step 3

Pass the histogram to the:

```text
Largest Rectangle in Histogram
```

algorithm.

Use:

- Previous Smaller Element (PSE)
- Next Smaller Element (NSE)

or

- Single-pass Monotonic Stack

to compute the maximum rectangle area.

---

### Step 4

Update:

```text
maxArea =
max(maxArea, histogramArea)
```

---

### Step 5

After all rows are processed:

```text
Return maxArea
```

---

## Dry Run

### Histogram at Row 3

```text
[3,1,3,2,2]
```

Largest rectangle:

```text
Height = 2
Width  = 3
```

Area:

```text
2 × 3 = 6
```

Maximum so far:

```text
6
```

---

## Why It Works?

Every rectangle of 1's must end at some row.

When we convert a row into a histogram:

```text
height[j]
=
continuous count of 1's above it
```

the largest rectangle ending at that row becomes exactly the:

```text
Largest Rectangle in Histogram
```

problem.

Checking all rows guarantees that the global maximum rectangle is found.

---

## Time Complexity

Let:

```text
Rows = R
Columns = C
```

Building histogram:

```text
O(R × C)
```

Largest Histogram per row:

```text
O(C)
```

Total:

```text
O(R × C)
```

---

## Space Complexity

Histogram array:

```text
O(C)
```

Stack used for histogram calculation:

```text
O(C)
```

Overall:

```text
O(C)
```

---

### Author 
- Rohit
