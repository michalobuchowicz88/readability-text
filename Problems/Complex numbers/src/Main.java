import java.util.Scanner;

class Complex {

    double real;
    double image;
    String sum;

    public void add(Complex num) {
        this.real= real + num.real;
        this.image = image  + num.image;
        sum = this.real + " + " + this.image + "i";

        System.out.println(sum);
    }

    public void subtract(Complex num) {

        this.real = real - num.real;
        this.image = image  - num.image;
        sum = this.real + " + " + this.image + "i";

        System.out.println(sum);

    }

}

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numberReal = scan.nextDouble();
        double numberImaginary = scan.nextDouble();

        double anotherNumberReal = scan.nextDouble();
        double anotherNumberImaginary = scan.nextDouble();

        Complex number = new Complex();
        number.real = numberReal;
        number.image = numberImaginary;

        Complex anotherNumber = new Complex();
        anotherNumber.real = anotherNumberReal;
        anotherNumber.image = anotherNumberImaginary;

        number.subtract(anotherNumber);
        number.subtract(anotherNumber);
        number.add(anotherNumber);


    }
}