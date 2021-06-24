import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        String[] datas;

        datas = url.split("[:=&/?']");
        String[] container = new String[1];

        for (int i = 0; i < datas.length; i++) {
            if (datas[i].equals("pass") && i != datas.length - 1) {
                if (datas[i + 1].isEmpty()) {
                    System.out.println("pass : cant be empty");
                } else {
                    System.out.println("pass : " + datas[i + 1]);
                    container[0] = datas[i + 1];
                }
            }

            if (datas[i].equals("port") && i != datas.length - 1) {
                if (datas[i + 1].isEmpty()) {
                    System.out.println("port : not found");
                } else {
                    System.out.println("port : " + datas[i + 1]);
                }
            } else if (datas[i].equals("port") && i == datas.length - 1) {
                System.out.println("port : not found");
            }

            if (datas[i].equals("cookie") && i != datas.length - 1) {

                if (datas[i + 1].isEmpty()) {
                    System.out.println("cookie : not found");
                } else {
                    System.out.println("cookie : " + datas[i + 1]);
                }
            } else if (datas[i].equals("cookie") && i == datas.length - 1) {
                System.out.println("cookie : not found");
            }

            if (datas[i].equals("name") && i != datas.length - 1) {
                System.out.println("name : " + datas[i + 1]);
            }

            if (datas[i].equals("host") && i != datas.length - 1) {
                if (datas[i + 1].isEmpty()) {
                    System.out.println("host : not found");
                } else {
                    System.out.println("host : " + datas[i + 1]);
                }
            } else if (datas[i].equals("host") && i == datas.length - 1) {
                System.out.println("host : not found");
            }

            if (i == datas.length - 1 && url.contains("pass")) {
                System.out.println("password : " + container[0]);
            }

        }
    }
}