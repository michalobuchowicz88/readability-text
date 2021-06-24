import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        double result = secondNumber - firstNumber;
        System.out.println(result);
    }
}