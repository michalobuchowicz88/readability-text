import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 1;

        do {

            int number = scan.nextInt();
             if (number > max) {
                 max = number;
             } else if (number == 0) {
                 min = number;
             }
        }
        while (min != 0);
        System.out.println(max);
    }
}