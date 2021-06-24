import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int howManyNumbers = scan.nextInt();

        int counter = 0;


        for (int i = 1; i <= howManyNumbers; i++) {

            for (int j = 1; j < i + 1; j++) {
                if (counter < howManyNumbers) {
                    System.out.print(i + " ");
                    counter++;
                }

                if (counter > howManyNumbers) {
                    break;
                }

            }

        }
    }
}