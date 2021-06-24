import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int totalFood = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();

        System.out.println(costOfOneNight * (duration - 1) +
                        duration * totalFood + 2 * oneWayFlight);

        // put your code here
    }
}