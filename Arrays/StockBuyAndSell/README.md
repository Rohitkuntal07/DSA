# Stock Buy and Sell – Multiple Transactions Allowed

## Problem Statement
You are given an array `prices[]`, where `prices[i]` is the cost of a stock on the `i-th` day.  
You can perform multiple transactions (buy and sell) to maximize your profit with the following conditions:
- You must sell the stock before you buy again.
- You can buy and sell the stock on the **same day**.

The task is to calculate the **maximum profit** you can achieve.

---

## Examples

### Example 1
**Input**:
prices = [100, 180, 260, 310, 40, 535, 695]<br>

**Output**:
865<br>

**Explanation**:
- Buy on day 0 and sell on day 3 → `310 - 100 = 210`
- Buy on day 4 and sell on day 6 → `695 - 40 = 655`
- **Total Profit** = `210 + 655 = 865`

---

### Example 2
**Input**:
prices = [4, 2, 2, 2, 4]<br>

**Output**:
2<br>

---

## Complexity
- **Time Complexity**: `O(n)` – One pass through the prices array.
- **Space Complexity**: `O(1)` – Constant extra space used.

---

## Constraints
- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

---

### Author
Rohit
