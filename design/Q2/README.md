## Q2: Factory Method Pattern - Document Management System

This example demonstrates the Factory Method Design Pattern by implementing a document factory that can create different types of documents (Word, PDF, Excel).

### Structure:
- `Document.java`: Interface for all documents
- `WordDocument`, `PdfDocument`, `ExcelDocument`: Concrete document types
- `DocumentFactory.java`: Abstract factory
- Concrete factories: `WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`
- `Main.java`: Test class to show usage

Each document is created using its specific factory to keep object creation loosely coupled and extendable.
