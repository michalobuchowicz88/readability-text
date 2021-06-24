import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        Boolean result = value1 >= value2 && value1 <= value3;
        Boolean result2 = value1 <= value2 && value1 >= value3;

        if (result || result2) {
            System.out.println(result || result2);
        } else {
            System.out.println(result && result2);
        }

        // put your code here
    }
}