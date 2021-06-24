import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        Boolean result = city.endsWith("burg");

        System.out.println(result);

    }
}