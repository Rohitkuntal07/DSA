## Minimize the Heights
You are given an array `arr[]` of size `n`, where each element represents the height of a tower, and an integer `k`.  

For **each tower**, you must **perform exactly one operation**:
- **Increase** the height by `k`, or
- **Decrease** the height by `k`.

Your task is to **minimize the difference** between the tallest and shortest towers after applying the operations, ensuring that **no tower height becomes negative**.

---

## Examples

### Example 1
**Input:**
k = 2<br>
arr = [1, 5, 8, 10]<br>
**Process:**
- Modify heights as `[1+2, 5-2, 8-2, 10-2]` → `[3, 3, 6, 8]`<br>
**Output:**
5

### Example 2
**Input:**
k = 3<br>
arr = [3, 9, 12, 16, 20]<br>
**Process:**
- Modify heights as `[3+3, 9+3, 12-3, 16-3, 20-3]` → `[6, 12, 9, 13, 17]`<br>
**Output:**
11

---

## Constraints
- `1 ≤ k ≤ 10^7`
- `1 ≤ n ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^7`

---

### Author
Rohit
