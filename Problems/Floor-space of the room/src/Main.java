import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        String floorage = scan.nextLine();

        double a;
        double b;
        double c;
        double r;
        double p;
        double area;

        switch (floorage) {
            case "triangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = scan.nextDouble();
                if (c > a && c > b && a != 0 && b!= 0 && c !=0) {
                    p = (a + b + c) / 2;

                    System.out.println(area = Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                    break;
                }
                else {
                    System.out.println("To short c");
                    break;
                }


            case "rectangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                if (a != 0 && b!= 0) {
                    System.out.println(a * b);
                    break;
                }
                else {
                    break;
                }


            case "circle":
                r = scan.nextDouble();
                if (r != 0) {
                    System.out.println(Math.pow(r, 2) * 3.14);
                    break;
                }
                else {
                    break;
                }

            default:
                System.out.println("There isn't such a room");
                break;

        }

    }
}