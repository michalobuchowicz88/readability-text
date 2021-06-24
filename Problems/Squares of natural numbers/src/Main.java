import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int newNumber = scan.nextInt();
        int square;
        int n = 1;

        do {

            square = n * n;
            n++;
            if (square <= newNumber) {
                System.out.println(square);
            }
        }
        while (newNumber > square);
    }
}