import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here


        if (firstName.length() > 0 && lastName.length() > 0) {
            return firstName + " " + lastName;
        } else if (firstName.length() == 0) {
            return lastName;
        } else if (lastName.length() == 0) {
            return firstName;
        } else {
            return "";
        }


    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? "" : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? "" : lastName;

        prepareFullName(firstName, lastName);

        System.out.println(prepareFullName(firstName, lastName));
    }
}