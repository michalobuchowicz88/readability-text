import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int howBig = scan.nextInt();
        int[] array = new int[howBig];
        int sumOfNumbers = 0;

        for (int i = 0; i < howBig; i++) {
            int numbers = scan.nextInt();
            array[i] = numbers;
        }

        for (int sum: array) {
            sumOfNumbers = sumOfNumbers + sum;
        }
        System.out.println(sumOfNumbers);



    }
}