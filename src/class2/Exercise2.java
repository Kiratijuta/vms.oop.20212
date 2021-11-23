package class2;

import java.util.Scanner;

public class Exercise2 {

    /**
     *  Exercise2: String Comparison with .equals and .equalsIgnoreCase
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = reader.nextLine();
        System.out.print("Enter your password: ");
        String password = reader.nextLine();

        if (username.equalsIgnoreCase("admin") && password.equals("0000")) {
            System.out.println("You are allowed to enter");
        } else {
            System.out.println("Access Denied");
        }

        reader.close();
    }
}
