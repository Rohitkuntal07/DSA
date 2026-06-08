## Asteroid Collision

### Problem Statement

Given an array of integers `asteroids`, where each integer represents an asteroid in a row, determine the state of the asteroids after all collisions.

- Absolute value → Size of the asteroid.
- Positive value → Moving right.
- Negative value → Moving left.

When two asteroids collide:

- The smaller asteroid explodes.
- If both are of the same size, both explode.
- Asteroids moving in the same direction never collide.

---

### Examples

#### Example 1

**Input:**

```text
asteroids = [2, -2]
```

**Output:**

```text
[]
```

**Explanation:**

Asteroids 2 and -2 collide and both explode.

---

#### Example 2

**Input:**

```text
asteroids = [10, 20, -10]
```

**Output:**

```text
[10, 20]
```

**Explanation:**

- 20 and -10 collide.
- 20 survives because it is larger.
- 10 and 20 never collide.

---

## Approach

### Intuition

A collision can occur only when:

```text
Right-moving asteroid (+)
followed by
Left-moving asteroid (-)
```

This resembles a stack problem because we need to compare the current asteroid with the most recent right-moving asteroid.

A stack helps us efficiently resolve all possible collisions.

---

## Algorithm

1. Create an empty stack.

2. Traverse each asteroid in the array.

3. If the asteroid is moving right (`> 0`):
   - Push it into the stack.

4. If the asteroid is moving left (`< 0`):
   - While:
     - Stack is not empty.
     - Top asteroid is moving right.
     - Top asteroid is smaller than the current asteroid.
   - Pop the top asteroid.

5. After the loop:

   **Case 1:** Equal size collision

   - If stack is not empty and:
     ```text
     stack.peek() == abs(current)
     ```
   - Pop the top asteroid.
   - Do not push the current asteroid.

   **Case 2:** Current asteroid gets destroyed

   - If stack is not empty and:
     ```text
     stack.peek() > abs(current)
     ```
   - Ignore the current asteroid.

   **Case 3:** Current asteroid survives

   - If stack is empty OR
   - Top asteroid is moving left

   - Push the current asteroid.

6. Return all elements present in the stack.

---

## Dry Run

### Input

```text
asteroids = [10, 20, -10]
```

### Process

```text
Stack = []

10  -> Push
Stack = [10]

20  -> Push
Stack = [10, 20]

-10 -> Collision with 20

20 > 10

-10 explodes
```

### Result

```text
[10, 20]
```

---

## Time Complexity

```text
O(N)
```

Each asteroid is pushed and popped at most once.

## Space Complexity

```text
O(N)
```

---

### Author
- Rohit
