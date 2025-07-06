## Q6: Proxy Pattern - Image Viewer System

This project demonstrates the Proxy Design Pattern using an image viewer app that loads images from a remote server with lazy initialization and caching.

### Components:
- `Image.java` — Interface for image operations
- `RealImage.java` — Loads image from server (real subject)
- `ProxyImage.java` — Lazy loads and caches the real image (proxy)
- `Main.java` — Shows how proxy reduces repeated remote calls

### Use Case:
Avoid expensive image loading until needed and cache for performance.
