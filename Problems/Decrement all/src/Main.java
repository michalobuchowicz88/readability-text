import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();

        System.out.println((firstNumber - 1) + " " + (secondNumber - 1) + " " +
                (thirdNumber - 1) + " " + (fourthNumber - 1));

        char c = '1' + '3';
        System.out.println(c);

        // put your code here
    }
}