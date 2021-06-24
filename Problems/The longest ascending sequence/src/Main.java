import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int lenght = scan.nextInt();
        int[] array = new int[lenght + 1];
        int counter = 0;
        int counterMax = 0;
        array[lenght] = 0;

        for (int i = 0; i < lenght; i++) {
            int nextNumber = scan.nextInt();
            array[i] = nextNumber;
        }

        for (int j = 0; j < lenght; j++) {
            if (array[j] < array[j + 1]) {
                counter++;
            } else {
                if (counter >= counterMax) {
                    counter++;
                    counterMax = counter;
                } else {
                    counterMax = counterMax + 0;
                }

                counter = 0;
                continue;
            }

        }

        if (lenght == 1) {
            counterMax = 1;
        }
        if (counterMax == 0) {
            System.out.println(counter + 1);
        } else {
            System.out.println(counterMax);
        }
    }
}