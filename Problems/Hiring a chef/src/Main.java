//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String stageOfEducation = scanner.next();
        String yearsOfExperience = scanner.next();
        String cousinePreference = scanner.next();

        System.out.print("The form for " + name + " is completed. " +
                "We will contact you if we need a chef that cooks "
                + cousinePreference + " dishes.");

    // put your code here
    }
}
