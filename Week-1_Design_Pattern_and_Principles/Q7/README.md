## Q7: Observer Pattern - Stock Market Monitoring System

This example uses the Observer Pattern to notify multiple clients when stock prices change.

### Structure:
- `Stock.java`: Subject interface with observer registration/removal
- `StockMarket.java`: Concrete subject that holds stock data and notifies observers
- `Observer.java`: Interface for observers (clients)
- `MobileApp.java`, `WebApp.java`: Observer implementations
- `Main.java`: Test class

### Example:
Mobile and web clients subscribe to a stock market feed and get real-time price updates.
