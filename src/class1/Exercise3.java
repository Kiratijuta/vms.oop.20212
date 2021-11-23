package class1;

import java.util.Scanner;

public class Exercise3 {

    /**
     *  Exercise3: Ask user inputs with Scanner
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your nickname: ");
        String nickname = reader.nextLine();
        System.out.print("Enter your firstname: ");
        String firstname = reader.nextLine();
        System.out.print("Enter your lastname: ");
        String lastname = reader.nextLine();
        System.out.print("Enter your age: ");
        byte age = reader.nextByte();

        System.out.println();
        System.out.println("I'm " + nickname + " 😊");
        System.out.print("My fullname is " + firstname + " " + lastname + ". \n");
        System.out.print("I'm " + age + " years old.");

        reader.close();
    }

}
