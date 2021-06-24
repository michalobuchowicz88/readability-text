import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        long sum = 1;

        for (int i = firstNumber; i < secondNumber; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }
}