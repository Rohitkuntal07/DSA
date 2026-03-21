## Recursive Implementation of atoi()

### Problem Statement
Implement the function myAtoi(s) which converts the given string s to a 32-bit signed integer (similar to the C/C++ atoi function).

Steps to Implement:  
1. Ignore any leading whitespace characters ' ' until the first non-whitespace character is found.  
2. Check the next character to determine the sign. If it is '-', the number should be negative. If it is '+', the number should be positive. If neither is found, assume the number is positive.  
3. Read the digits and convert them into a number. Stop reading once a non-digit character is encountered or the end of the string is reached. Leading zeros should be ignored during conversion.  
4. Clamp the result within the 32-bit signed integer range: [-2147483648, 2147483647]. If the number is outside this range, return -2147483648 or 2147483647 accordingly.  
5. Return the computed number after applying all the above steps.

---

### Examples

Example 1

Input:  
s = " -12345"

Output:  
-12345

Explanation:  
Ignore leading whitespaces.  
The sign '-' indicates the number is negative.  
Digits 12345 are read and converted to -12345.

---

Example 2

Input:  
s = "4193 with words"

Output:  
4193

Explanation:  
Read the digits 4193 and stop when encountering the first non-digit character.

---
### Author
- Rohit
