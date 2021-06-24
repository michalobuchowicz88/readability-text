import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;


        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            if (x1 > x2) {
                System.out.print(x2 + " ");
                System.out.println(x1);
            } else {
                System.out.print(x1 + " ");
                System.out.println(x2);
            }


        } else if (delta == 0) {
            double x0 = (-b) / (2 * a);
            System.out.println(x0);
        } else {

            System.out.println("No solution of the equation");
        }


    }
}