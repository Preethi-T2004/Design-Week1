## Q3: Builder Pattern - Computer Configuration System

This example demonstrates the Builder Pattern to create `Computer` objects with optional configurations.

### Structure:
- `Computer.java`: The product class with a static nested `Builder`
- `Main.java`: Demonstrates building different computer configurations

### Example Usage:
```java
Computer gamingPC = new Computer.Builder("i9", "32GB")
    .setStorage("2TB SSD")
    .setGPU("RTX 4090")
    .setOS("Windows 11")
    .build();
