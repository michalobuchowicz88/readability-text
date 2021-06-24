import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int numberOfElements = scan.nextInt();
        int[] array = new int[numberOfElements];
        int max = 0;
        for (int i = 0; i < numberOfElements; i++) {
            int nextNumber = scan.nextInt();
            array[i] = nextNumber;

        }
        for (int j = 0; j < numberOfElements; j++) {
            if (array[j] % 4 == 0 && array[j] > max) {
                max = array[j];
            }
        }
        System.out.println(max);




    }
}