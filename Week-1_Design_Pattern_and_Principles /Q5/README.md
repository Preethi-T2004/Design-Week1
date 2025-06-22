## Q5: Decorator Pattern - Notification System

This example shows how to use the Decorator Pattern to add notification channels dynamically (Email, SMS, Slack).

### Structure:
- `Notifier.java` — Base interface
- `EmailNotifier.java` — Concrete component
- `NotifierDecorator.java` — Abstract decorator
- `SMSNotifierDecorator.java`, `SlackNotifierDecorator.java` — Concrete decorators
- `Main.java` — Demonstration of dynamic channel stacking

### Example Usage:
