import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOne = scan.nextInt();
        int[] array = new int[100];
        int counter = 0;
        int trueOrFalse = 0;
        int[] arrayBoolean = new int[100];

        if (numberOne > 0) {
            array[0] = numberOne;
            for (int i = 0; i < 10; i++) {
                int numberNext = scan.nextInt();
                if (numberNext > 0) {
                    array[i + 1] = numberNext;
                    counter = i + 2;
                } else {
                    array[i + 1] = numberNext;
                    break;
                }


            }

            for (int j = 0; j < counter; j++) {
                if (j + 2 < counter) {
                    if (array[j] >= array[j + 1] && array[j + 1] >= array[j + 2]) {
                        arrayBoolean[j] = 2;
                    } else if (array[j] <= array[j + 1] && array[j + 1] <= array[j + 2]) {
                        arrayBoolean[j] = 2;

                    } else if (array[j] >= array[j + 1] && array[j + 1] <= array[j + 2]) {
                        arrayBoolean[j] = 0;
                    } else if (array[j] <= array[j + 1] && array[j + 1] >= array[j + 2]) {
                        arrayBoolean[j] = 0;
                    } else {
                        arrayBoolean[j] = 0;
                    }
                } else {
                    if (array[j] >= array[j + 1]) {
                        arrayBoolean[j] = 2;
                    } else if (array[j] <= array[j + 1]) {
                        arrayBoolean[j] = 2;
                    } else {
                        arrayBoolean[j] = 0;
                    }
                }


            }


            for (int a = 0; a < counter; a++) {
                if (a + 1 < counter) {
                    if (arrayBoolean[a] == 0 && arrayBoolean[a + 1] == 0) {
                        trueOrFalse = 0;
                    } else if (arrayBoolean[a] == 2 && arrayBoolean[a + 1] == 0) {
                        trueOrFalse = 0;
                    } else if (arrayBoolean[a] == 0 && arrayBoolean[a + 1] == 2) {
                        trueOrFalse = 0;
                    } else if (arrayBoolean[a] == 2 && arrayBoolean[a + 1] == 2) {
                        trueOrFalse += 2;
                    }
                }

            }

            if (counter == 0 && array[0] > array[1]) {
                System.out.println("true");
            } else if (trueOrFalse / 2 != counter - 1) {
                System.out.println("false");
            } else if (trueOrFalse / 2 == counter - 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }



        }



    }
}