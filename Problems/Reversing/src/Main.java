import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        int digit = scan.nextInt();

        int digitOne = (digit % 100 - digit % 10) / 10;
        int digitTwo = (digit - digit % 100) / 100;
        int digitTree = digit % 10;

        if (digitTree > 0) {
            System.out.println(digitTree * 100 +
                    digitOne * 10 + digitTwo);
        } else {
            System.out.println(digitOne * 10 + digitTwo);
        }

    }
}