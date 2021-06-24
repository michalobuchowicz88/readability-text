import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        Boolean result = value1 + value2 == 20 ||
                value1 + value3 == 20 || value2 + value3 == 20;

        System.out.println(result);

        // put your code here
    }
}