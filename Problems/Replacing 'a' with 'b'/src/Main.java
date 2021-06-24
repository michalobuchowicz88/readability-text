import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here


        Scanner scan = new Scanner(System.in);
        String chars = scan.next();

        String newchars = chars.replace('a', 'b');
        System.out.println(newchars);

    }
}