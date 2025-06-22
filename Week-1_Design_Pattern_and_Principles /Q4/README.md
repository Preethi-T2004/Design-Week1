## Q4: Adapter Pattern - Payment Processing System

This example demonstrates the Adapter Pattern by allowing the system to process payments using different third-party gateways through a common interface.

### Structure:
- `PaymentProcessor.java` → Common target interface
- `PayPalGateway`, `StripeGateway` → Existing third-party classes (adaptees)
- `PayPalAdapter`, `StripeAdapter` → Adapters translating to unified interface
- `Main.java` → Test class

### Purpose:
The Adapter Pattern helps integrate incompatible interfaces without modifying the original code.
