## Introduction to Bit Manipulation

### Introduction

Bit Manipulation is the process of performing operations directly on binary representations of numbers using bits (0s and 1s).  
It is widely used in competitive programming, low-level programming, optimization problems, and computer architecture.

---

## Binary Number Conversion

### Decimal to Binary Conversion

Repeatedly divide the number by 2 and store the remainders.

Example: Convert 13 to Binary

13 / 2 = 6 remainder 1  
6 / 2 = 3 remainder 0  
3 / 2 = 1 remainder 1  
1 / 2 = 0 remainder 1  

Reading remainders from bottom to top:

Binary = 1101

---

### Binary to Decimal Conversion

Multiply each bit with 2 raised to the power of its position.

Example: Convert 1101 to Decimal

1 × 2^0 = 1  
0 × 2^1 = 0  
1 × 2^2 = 4  
1 × 2^3 = 8  

Total = 1 + 0 + 4 + 8 = 13

---

## One's Complement

Flip all bits of the binary number.

Example:

13 = 0000 1101  
One's Complement = 1111 0010

---

## Two's Complement

Take the one's complement and add 1.

Example:

One's Complement = 1111 0010  
Add 1            = 1111 0011

---

## Bitwise Operators

### AND (&)

Both bits must be 1.

13 = 1101  
7  = 0111  

1101 & 0111 = 0101 = 5

---

### OR (|)

At least one bit must be 1.

1101 | 0111 = 1111 = 15

---

### XOR (^)

Bits must be different.

1101 ^ 0111 = 1010 = 10

---

### NOT (~)

Flips all bits.

~5 = -6

---

## Shift Operators

### Left Shift (<<)

Shifts bits left.

13 << 1 = 26

Equivalent to multiplying by 2.

---

### Right Shift (>>)

Shifts bits right.

13 >> 1 = 6

Equivalent to dividing by 2.

---

## Important Bit Manipulation Tricks

### 1. Swap Two Numbers Without Extra Variable

A = A ^ B  
B = A ^ B  
A = A ^ B

---

### 2. Check if i-th Bit is Set

(1 << i) & num

or

(num >> i) & 1

---

### 3. Set the i-th Bit

num | (1 << i)

---

### 4. Clear the i-th Bit

num & ~(1 << i)

---

### 5. Toggle the i-th Bit

num ^ (1 << i)

---
### Author
- Rohit
