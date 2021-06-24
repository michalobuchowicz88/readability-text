import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        String preWord = scan.nextLine();
        Boolean result = preWord.charAt(0) == 'j';
        Boolean result2 = preWord.charAt(0) == 'J';
        Boolean fullresult = result || result2;

        System.out.println(fullresult);

    }
}