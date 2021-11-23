package class2;

import java.util.Scanner;

public class Exercise4 {

    /**
     *  Exercise4: Function declaration
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = reader.nextDouble();
        System.out.print("Enter b: ");
        double b = reader.nextDouble();

        double c = hypothenuse(a, b);
        System.out.println("The c length is " + c);
    }

    public static double hypothenuse(double a, double b) {
        double inside = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(inside);
        return c;
    }
}
