import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int i = 0;

        for (i = number1; i < number2 + 1; i++) { 
            if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");  
            } 
            else if (i % 3 == 0 && i % 5 != 0) {
            System.out.println("Fizz"); 
            } 
            else if (i % 5 == 0 && i % 3 != 0) 
            {
            System.out.println("Buzz"); 
            } 
            else {
            System.out.println(i); 
            }
        }

    }
}
