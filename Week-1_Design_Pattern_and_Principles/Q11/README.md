## Q11: Dependency Injection - Customer Management App

This project demonstrates constructor-based Dependency Injection for decoupling service and repository layers.

### Components:
- `Customer.java`: Entity class representing customer data
- `CustomerRepository.java`: Repository interface
- `CustomerRepositoryImpl.java`: Implementation with in-memory data
- `CustomerService.java`: Depends on repository (injected via constructor)
- `Main.java`: Demonstrates service usage

### Key Concept:
Injecting dependencies externally promotes testability and loose coupling.
