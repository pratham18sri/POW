# Java Solutions – LCS, Subset Sum, Step Words

## 1. Longest Common Subsequence of 3 Strings

### Problem:
Given three strings A, B, and C, find the length of their longest common subsequence.

### Approach:
We use a 3D Dynamic Programming array `dp[i][j][k]` where each cell holds the length of LCS for substrings `A[0…i]`, `B[0…j]`, and `C[0…k]`.

### Time Complexity:
O(m * n * o)

---

## 2. Smallest Positive Integer Not Representable by Subset Sum

### Problem:
Given an array of positive integers, find the smallest positive integer that cannot be represented as a subset sum.

### Approach:
- Sort the array.
- Traverse and maintain the smallest number `res` that cannot be formed yet.
- If `res < current number`, then `res` can't be formed.

### Time Complexity:
O(n log n) – due to sorting

---

## 3. Valid Step Words from Dictionary

### Problem:
Given a base word and a dictionary, return all words that can be formed by inserting exactly one letter anywhere in the base word.

### Approach:
- For each dictionary word:
  - It must be one letter longer than the base word.
  - It must contain all letters of the base word in correct frequency with exactly one additional letter.

### Time Complexity:
O(n * 26) for n words in dictionary

---

### Author:
Pratham Srivastav

