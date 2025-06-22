## Q1: Inventory Management System – DSA

This project demonstrates the use of HashMap for managing product inventory efficiently.

### Features:
- Add, update, delete, and view products
- Each product has: `productId`, `productName`, `quantity`, and `price`

### Data Structure Used:
- `HashMap<String, Product>` for O(1) average performance

### Time Complexity:
- Add: O(1)
- Update: O(1)
- Delete: O(1)
- Search: O(1)

### Files:
- `Product.java`: POJO class for product data
- `InventoryManager.java`: Core logic using HashMap
- `Main.java`: Demonstrates inventory operations
