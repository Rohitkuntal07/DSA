# 🧮 Radix Sort (Java)

## 📘 Description
This program implements **Radix Sort**, a non-comparative sorting algorithm that sorts integers by processing individual digits from least significant to most significant.

## 🚀 How It Works
1. Find the maximum element to determine the number of digits.
2. Perform **counting sort** for each digit (units, tens, hundreds...).
3. Repeat until all digits are processed.

## 💻 Example & 🕒 Time Complexity
```java
int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
new Solution().radixSort(arr);
System.out.println(Arrays.toString(arr)); 
// Output: [2, 24, 45, 66, 75, 90, 170, 802]

// Time Complexity: O(d × (n + k))
//   d = number of digits
//   n = number of elements
//   k = range of digits (0–9)
// Space Complexity: O(n + k)
```

### Author
Rohit
