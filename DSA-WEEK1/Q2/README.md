## Q2: E-commerce Search Function – DSA

This exercise demonstrates linear and binary search implementations to locate products in an e-commerce platform.

### Features:
- `Product.java`: Represents products with name, ID, and category
- `SearchEngine.java`: Contains both linear and binary search algorithms
- `Main.java`: Demonstrates searches with example products

### Algorithms & Time Complexity:
| Search Type     | Best | Average | Worst |
|-----------------|------|---------|-------|
| Linear Search   | O(1) | O(n)    | O(n)  |
| Binary Search   | O(1) | O(log n)| O(log n) |

> Binary Search is faster but requires the data to be sorted.

### Outcome:
Use binary search for speed when data is sorted; otherwise, use linear search.
