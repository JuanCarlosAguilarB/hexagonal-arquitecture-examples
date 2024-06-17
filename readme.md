# Hexagonal Architecture Examples

This repository contains a collection of practical examples of Hexagonal Architecture (also known as Ports and Adapters) in various programming languages. The Hexagonal Architecture is a design pattern that promotes framework independence and facilitates application development and testing.

## What is Hexagonal Architecture

The Hexagonal Architecture focuses on dividing an application into layers that are independent of each other and connected through well-defined interfaces. The main layers include:

- **Domain:** Contains the business logic of the application and defines the models and services that are specific to the application.
  
- Adapters:** These are the input and output ports that allow the application to interact with the outside world. These adapters include user interfaces (UI), databases, external services, etc.

- **Application:** Acts as the glue between the domain and the adapters, coordinating interactions and ensuring that business rules are followed.

## Repository Structure

The repository is organized into separate folders by programming language. Each folder contains an example application implemented following the principles of the Hexagonal Architecture. The examples are designed to be simple but representative of how this pattern can be implemented in practice.

## Contributions

Contributions are welcome! If you want to add an example in another programming language or improve any of the existing examples, please follow these steps:

1. Make a fork of the repository.
2. Create a branch with a descriptive name (`git checkout -b my-new-functionality`).
3. Make your changes and make sure that the examples follow the best practices and principles of the Hexagonal Architecture.
4. Commit your changes (`git commit -am 'Added Ruby example'`).
5. Push to the branch (`git push origin my-new-functionality`).
6. Ope