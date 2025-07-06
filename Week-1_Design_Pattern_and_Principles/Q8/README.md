## Q8: Strategy Pattern - Payment System

This example uses the Strategy Pattern to allow runtime selection of payment methods like Credit Card and PayPal.

### Structure:
- `PaymentStrategy.java` — Interface for all payment strategies
- `CreditCardPayment.java`, `PayPalPayment.java` — Concrete implementations
- `PaymentContext.java` — Holds the strategy and executes the payment
- `Main.java` — Demonstrates switching between payment methods dynamically

### Key Benefit:
The payment system is flexible and easily extendable for new payment options.
