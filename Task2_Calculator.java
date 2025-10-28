// Task 2: Calculator Program 
// Author: Reshma Bollagani
// Internship: Alfido Tech Java Developer
// Description: Calculator program
import java.util.Scanner;

public class Task2_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0.0;
        char operator;

        System.out.println("\n===================================");
        System.out.println("        Simple Calculator");
        System.out.println("===================================");

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /");
                sc.close();
                return;
        }

        System.out.println("-----------------------------------");
        System.out.println("Result: " + result);
        System.out.println("===================================");
        sc.close();
    }
}
