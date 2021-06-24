import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        int travelTime = scan.nextInt();

        double averageSpeed = (double) (distance / travelTime);
        System.out.println(averageSpeed);

    }
}