import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine() + "k";
        int arraySize;
        String[] parts;


        String textFragment = scan.nextLine();
        String newFragment = textFragment;
        parts = text.split(newFragment);
        if (parts.length > 0) {
            arraySize = parts.length - 1;
        } else {
            arraySize = parts.length + 1;
        }
        System.out.println(arraySize);

    }
}