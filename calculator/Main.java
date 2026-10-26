package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("=== Simple Strategy Calculator ===");
        System.out.println("Commands: add, sub, mul, div, exit");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add" -> calculator.setStrategy(new AddStrategy());
                case "sub" -> calculator.setStrategy(new SubtractStrategy());
                case "mul" -> calculator.setStrategy(new MultiplyStrategy());
                case "div" -> calculator.setStrategy(new DivideStrategy());
                case "exit" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> {
                    System.out.println("Unknown command.");
                    continue;
                }
            }

            System.out.print("Enter first number:  ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter second number: ");
            double b = Double.parseDouble(scanner.nextLine());

            try {
                double result = calculator.compute(a, b);
                System.out.printf("%s result: %.2f%n",
                        calculator.getCurrentStrategyName(), result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}