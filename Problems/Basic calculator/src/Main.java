class Problem {

    public static void main(String[] args) {

        int variable1;
        int variable2;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("+")) {
                variable1 = Integer.parseInt(args[i + 1]);
                variable2 = Integer.parseInt(args[i + 2]);
                System.out.println(variable1 + variable2);
            } else if (args[i].equals("-")) {
                variable1 = Integer.parseInt(args[i + 1]);
                variable2 = Integer.parseInt(args[i + 2]);
                System.out.println(variable1 - variable2);
            } else if (args[i].equals("*")) {
                variable1 = Integer.parseInt(args[i + 1]);
                variable2 = Integer.parseInt(args[i + 2]);
                System.out.println(variable1 * variable2);
            } else if (i % 3 == 0) {
                System.out.println("Unknown operator");
            }


        }

    }
}