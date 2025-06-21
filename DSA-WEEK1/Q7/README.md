##  Financial Forecasting – DSA

This exercise demonstrates how to use recursion to forecast future financial values using past growth rates.

### Formula:
Future Value (n years) = Principal * (1 + rate)^n

### Implementations:
- **Recursive** method
- **Memoized Recursive** (optimized)
- **Iterative** (optional and efficient)

### Time Complexity:
| Method     | Time | Space |
|------------|------|-------|
| Recursive  | O(n) | O(n)  |
| Memoized   | O(n) | O(n)  |
| Iterative  | O(n) | O(1)  |

### Recommendation:
Use **memoization or iteration** to optimize large-year forecasts.
