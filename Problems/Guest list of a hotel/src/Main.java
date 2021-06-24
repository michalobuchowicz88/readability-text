//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String[] array = new String[9];

        for (int i = 0; i < 8; i++) {
            array[i] = scan.next();
        }
        for (int j = 7; j > -1; j--) {
            System.out.println(array[j]);
        }

    }
}