# POW (Problem of the Week) – 2025

This repository contains Java implementations for selected algorithmic challenges focused on problem-solving, optimization, and real-world applications.

## ✅ Problems Included

---

### 1. 🔍 Min in Rotated Sorted Array

**Problem:**  
Given a rotated sorted array with no duplicates, find the minimum element in O(log N) time.

**Approach:**  
Uses binary search to identify the inflection point (minimum value).

**Time Complexity:** `O(log N)`  
**Space Complexity:** `O(1)`

📁 File: `BestSolution_MinRotatedArray.java`

---

### 2. ➕ Subarray Sum Equals K

**Problem:**  
Count the number of continuous subarrays whose sum equals a given target `k`.

**Approach:**  
Utilizes prefix sums and a hash map to track cumulative sum frequencies.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

📁 File: `BestSolution_SubarraySumEqualsK.java`

---

### 3. 🏠 Ruby Second House (Min Paint Cost)

**Problem:**  
Paint `n` houses using `k` colors such that no two adjacent houses have the same color, minimizing the total painting cost.

**Approach:**  
Dynamic Programming (`dp[i][j]` stores the minimum cost to paint house `i` with color `j`).

**Time Complexity:** `O(n × k²)`  
**Space Complexity:** `O(n × k)`

📁 File: `BestSolution_RubySecondHouse.java`

---

## 💡 Folder Structure

