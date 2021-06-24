// Don't delete this import statement

import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        if ("+".equals(operator)) {
            sumTwoNumbers(num1, num2);
        } else if ("-".equals(operator)) {
            subtractTwoNumbers(num1, num2);
        } else if ("/".equals(operator)) {
            divideTwoNumbers(num1, num2);
        } else if ("*".equals(operator)) {
            multiplyTwoNumbers(num1, num2);
        }


    }

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        long result = a - b;
        System.out.println(result);
    }


    public static void sumTwoNumbers(long a, long b) {
        long result = a + b;
        System.out.println(result);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b > 0) {
            long result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Division by 0!");
        }

    }


    public static void multiplyTwoNumbers(long a, long b) {
        long result = a * b;
        System.out.println(result);
    }
}