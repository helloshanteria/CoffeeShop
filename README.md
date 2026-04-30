# Coffee Shop Ordering System

This project is a Java console-based coffee shop ordering system created for my Programming Fundamentals course. The program allows a customer to select coffee options, choose flavors, and calculate the total price of their order.

## Project Purpose

The purpose of this project was to practice core Java programming concepts, including:

- Classes and objects
- Constructors
- Methods
- Conditional statements
- User input
- Arrays or menu selections
- Basic calculations
- Object interaction between classes

## Features

- Displays a coffee menu
- Displays a flavor menu
- Allows the customer to make selections
- Stores customer order details
- Calculates the total price
- Uses separate classes to organize the program

## Classes Used

- `Customer`
- `Coffee`
- `Flavor`
- `ShoppingTray`
- `Driver`

## Example Calculation

The `ShoppingTray` class calculates the total price by adding the coffee price and flavor price together.

```java
public double getTotalPrice() {
    double cPrice = coffee.getPrice();
    double fPrice = flavor.getFPrice();
    double totalPrice = cPrice + fPrice;
    return totalPrice;
}
