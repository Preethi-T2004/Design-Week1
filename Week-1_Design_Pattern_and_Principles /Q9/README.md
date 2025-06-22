## Q9: Command Pattern - Home Automation System

This implementation uses the Command Pattern to issue commands for turning lights on and off through a remote control.

### Components:
- `Command.java` — Command interface
- `Light.java` — Receiver class
- `LightOnCommand.java`, `LightOffCommand.java` — Concrete commands
- `RemoteControl.java` — Invoker that triggers commands
- `Main.java` — Demonstrates usage

### Use Case:
Encapsulates device actions as command objects, allowing for flexible, decoupled execution.
