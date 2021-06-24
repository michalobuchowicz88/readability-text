import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfElements = 100;
        String[] array = new String[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            int nextNumber = scan.nextInt();
            if (nextNumber % 2 == 0 && nextNumber != 0) {
                array[i] = "even";
            } else if (nextNumber % 2 == 1 && nextNumber != 0) {
                array[i] = "odd";
            } else if (nextNumber == 0) {
                array[i] = " ";
                break;
            }
        }

        for (int j = 0; j < numberOfElements; j++) {
            if (array[j].equals(" ")) {
                break;
            } else {
                System.out.println(array[j]);
            }
        }
    }
}