import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = vs.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = vs.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = vs.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        vs.close();
    }
} 