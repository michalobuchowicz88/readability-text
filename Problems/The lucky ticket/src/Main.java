import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        String ticket = scan.nextLine();
        int sum1 = 0;
        int sum2 = 0;



        for (int i = 0; i < ticket.length(); i++) {
            char sumOfNumbers = ticket.charAt(i);
            if (i < 3) {
                sum1 += sumOfNumbers;
            } else if (i > ticket.length() - 4) {
                sum2 += sumOfNumbers;
            }
        }

        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }


    }
}