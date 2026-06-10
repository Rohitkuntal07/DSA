## Remove K Digits

### Problem Statement

Given a string `nums` representing a non-negative integer and an integer `k`, remove exactly `k` digits from the number so that the resulting number is the smallest possible.

Return the resulting number as a string.

---

### Examples

#### Example 1

**Input:**

```text
nums = "541892"
k = 2
```

**Output:**

```text
"1892"
```

**Explanation:**

Removing digits `5` and `4` produces the smallest possible number:

```text
541892 → 1892
```

---

#### Example 2

**Input:**

```text
nums = "1002991"
k = 3
```

**Output:**

```text
"21"
```

**Explanation:**

Remove:

```text
1, 9, 9
```

Result:

```text
0021
```

After removing leading zeros:

```text
21
```

---

## Approach

### Intuition

To obtain the smallest possible number, we should remove larger digits whenever a smaller digit appears after them.

A stack helps us efficiently maintain digits in increasing order.

Whenever the current digit is smaller than the stack top:

```text
stack top > current digit
```

we remove the larger digit because keeping the smaller digit earlier produces a smaller overall number.

This is a classic **Monotonic Increasing Stack** problem.

---

## Algorithm

1. Create an empty stack.

2. Traverse every digit in `nums`.

3. While:

   - Stack is not empty.
   - Current digit is smaller than stack top.
   - `k > 0`.

   Pop the stack and decrement `k`.

4. Push the current digit into the stack.

5. After processing all digits:

   If `k > 0`:

   - Remove the last `k` digits from the stack.

6. Build the answer string from the stack.

7. Remove all leading zeros.

8. If the resulting string becomes empty:

   ```text
   return "0"
   ```

9. Return the final string.

---

## Dry Run

### Input

```text
nums = "541892"
k = 2
```

### Process

```text
Stack = []

5 → push
[5]

4 → 4 < 5
pop 5, k=1
push 4
[4]

1 → 1 < 4
pop 4, k=0
push 1
[1]

8 → push
[1,8]

9 → push
[1,8,9]

2 → push
[1,8,9,2]
```

Result:

```text
1892
```

---

## Edge Cases

### Case 1

If all digits are removed:

```text
nums = "10"
k = 2
```

Output:

```text
"0"
```

---

### Case 2

Leading zeros appear:

```text
nums = "10200"
k = 1
```

Result before trimming:

```text
0200
```

Final result:

```text
200
```

---

### Case 3

Digits remain in increasing order:

```text
nums = "12345"
k = 2
```

No removals occur during traversal.

Remove the last two digits:

```text
123
```

---

## Time Complexity

```text
O(N)
```

Each digit is pushed and popped at most once.

## Space Complexity

```text
O(N)
```

For the stack.

--- 

### Author
- Rohit
