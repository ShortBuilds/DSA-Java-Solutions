# 1. Two Sum
**Difficulty:** Easy | **Topic:** Hash Table / Array

## 💡 Concept: HashMap in Java
A **HashMap** allows us to store data in key-value pairs. In this problem, we use it to achieve $O(n)$ time complexity instead of $O(n^2)$.
* **Structure:** `Map<Integer, Integer> map = new HashMap<>();`
* **Key methods:** `map.containsKey(value)` (checks if a number exists) and `map.put(key, value)` (stores the number and its index).

## 📝 Logic & Approach (One-Pass Hash Table)
1. Create a HashMap to store the numbers we have seen so far and their indices.
2. For each number `x` in the array:
   - Calculate the `complement = target - x`.
   - If the `complement` exists in our Map, we found the two numbers. Return their indices.
   - If not, add the current number `x` and its index to the Map and move to the next.

## 🧪 Dry Run
**Input:** `nums = [2, 11, 7, 15]`, `target = 9`
- **Step 1 (i=0):** `x = 2`. Complement = $9 - 2 = 7$. Map is empty. Put `{2: 0}`.
- **Step 2 (i=1):** `x = 11`. Complement = $9 - 11 = -2$. Not in map. Put `{11: 1}`.
- **Step 3 (i=2):** `x = 7`. Complement = $9 - 7 = 2$. **2 is in the map!**
- **Result:** Return `[0, 2]`.

## 📊 Complexity
- **Time:** $O(n)$ — We only traverse the list once.
- **Space:** $O(n)$ — In the worst case, we store all elements in the map.
