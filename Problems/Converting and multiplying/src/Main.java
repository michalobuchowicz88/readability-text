import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String sequence;
        int[] array = new int[10];
        String[] arrayString = new String[10];
        int counter = 0;
        int newNumber;

        do {
            sequence = scan.nextLine();
            try {
                newNumber = Integer.parseInt(sequence);
                array[counter] = newNumber * 10;
                counter++;
            } catch (Exception e) {
                array[counter] = 1;
                arrayString[counter] = sequence;
                counter++;


            }
        }
        while (!"0".equals(sequence));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                System.out.println(array[i]);
            } else if (array[i] == 1) {
                System.out.println("Invalid user input: " +
                        arrayString[i]);
            }

        }







        /* try {
            int[] integers = Arrays.stream(sequence.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] != 0) {
                    integers[i] = integers[i] * 10;
                    System.out.println(integers[i]);
                }
                else {
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }

         */


    }
}