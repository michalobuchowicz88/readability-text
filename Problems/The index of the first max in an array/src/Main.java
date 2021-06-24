import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int howBigArray = scan.nextInt();
        int[] array = new int[howBigArray];
        int index = 0;
        int[] newArray = new int[howBigArray];

        for (int i = 0; i < howBigArray; i++) {
            int nextNumber = scan.nextInt();
            array[i] = nextNumber;
            newArray[i] = nextNumber;
        }
        Arrays.sort(array);


        for (int j = 0; j < howBigArray; j++) {
            if (newArray[j] == array[howBigArray - 1]) {
                index = j;
                break;
            }
        }
        System.out.println(index);


    }
}