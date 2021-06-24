import java.util.Arrays;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] arrayInt = new int[args.length - 1];
        int sum = 0;

        for (int i = 0; i < args.length - 1; i++) {
            arrayInt[i] = Integer.parseInt(args[i + 1]);
            sum = sum + arrayInt[i];

        }

        Arrays.sort(arrayInt);

        switch (operator) {
            case "MAX":
                System.out.println(arrayInt[args.length - 2]);
                break;
            case "MIN":
                System.out.println(arrayInt[0]);
                break;
            case "SUM":
                System.out.println(sum);
                break;
            default:
                System.out.println("");
                break;


        }
        // write your code here
    }
}