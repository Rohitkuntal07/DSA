## Celebrity Problem

### Problem Statement

A celebrity is a person who:

1. Is known by everyone else at the party.
2. Does not know anyone at the party.

Given an `N × N` matrix `M` where:

```text
M[i][j] = 1  → Person i knows Person j
M[i][j] = 0  → Person i does not know Person j
```

Find the celebrity's index.

Return:

```text
Celebrity Index
```

or

```text
-1
```

if no celebrity exists.

**Note:**

```text
M[i][i] = 0
```

---

### Examples

#### Example 1

**Input**

```text
M =
[
 [0,1,1,0],
 [0,0,0,0],
 [1,1,0,0],
 [0,1,1,0]
]
```

**Output**

```text
1
```

**Explanation**

Person 1:

```text
Knows nobody
```

and

```text
Everyone knows Person 1
```

Hence Person 1 is the celebrity.

---

#### Example 2

**Input**

```text
M =
[
 [0,1],
 [1,0]
]
```

**Output**

```text
-1
```

**Explanation**

Both persons know each other.

No celebrity exists.

---

# Brute Force Approach

## Idea

For every person:

1. Check if they know nobody.
2. Check if everyone knows them.

If both conditions hold:

```text
Return that person.
```

Otherwise continue.

---

### Time Complexity

```text
O(N²)
```

### Space Complexity

```text
O(1)
```

---

# Optimal Approach (Two Pointers)

## Intuition

Suppose we compare two people:

```text
A and B
```

### Case 1

If:

```text
A knows B
```

Then:

```text
A cannot be celebrity
```

because a celebrity knows nobody.

Eliminate A.

---

### Case 2

If:

```text
A does not know B
```

Then:

```text
B cannot be celebrity
```

because everyone must know the celebrity.

Eliminate B.

---

Thus, one comparison eliminates one candidate.

After repeatedly eliminating candidates, only one possible celebrity remains.

Then perform a final verification.

---

## Algorithm

### Step 1: Candidate Selection

Initialize:

```text
top = 0
bottom = N - 1
```

---

### Step 2

While:

```text
top < bottom
```

Compare:

```text
M[top][bottom]
```

---

#### If top knows bottom

```text
M[top][bottom] == 1
```

Then:

```text
top cannot be celebrity
```

Move:

```text
top++
```

---

#### Else

```text
top does not know bottom
```

Then:

```text
bottom cannot be celebrity
```

Move:

```text
bottom--
```

---

After the loop:

```text
candidate = top
```

---

### Step 3: Verification

A celebrity must satisfy:

#### Condition 1

Knows nobody:

```text
M[candidate][j] == 0
for all j ≠ candidate
```

---

#### Condition 2

Everyone knows candidate:

```text
M[i][candidate] == 1
for all i ≠ candidate
```

---

### Step 4

If both conditions hold:

```text
return candidate
```

Else:

```text
return -1
```

---

## Dry Run

### Input

```text
[
 [0,1,1,0],
 [0,0,0,0],
 [1,1,0,0],
 [0,1,1,0]
]
```

### Candidate Selection

```text
top = 0
bottom = 3
```

---

Compare:

```text
0 knows 3 ?
```

No

```text
bottom--
```

```text
bottom = 2
```

---

Compare:

```text
0 knows 2 ?
```

Yes

```text
top++
```

```text
top = 1
```

---

Compare:

```text
1 knows 2 ?
```

No

```text
bottom--
```

```text
bottom = 1
```

Loop ends.

Candidate:

```text
1
```

---

### Verification

Row 1:

```text
[0,0,0,0]
```

Knows nobody ✓

---

Column 1:

```text
1, -, 1, 1
```

Everyone knows 1 ✓

---

Answer:

```text
1
```

---

## Why This Works?

Each comparison eliminates exactly one person from being a celebrity.

Therefore:

```text
N-1 comparisons
```

leave only one possible candidate.

A final verification ensures correctness.

---

## Time Complexity

### Candidate Selection

```text
O(N)
```

### Verification

```text
O(N)
```

Total:

```text
O(N)
```

---

## Space Complexity

```text
O(1)
```

---

### Author
- Rohit
