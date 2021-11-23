package class2;

public class CharacterProcessing2 {

    public static void main(String[] args) {

        System.out.println("According to Character.isLowerCase:");
        char checkIsLowerCase = 'p';
        if (Character.isLowerCase(checkIsLowerCase)) {
            System.out.println(checkIsLowerCase + " is a lowercase letter");
        } else {
            System.out.println(checkIsLowerCase + " is not a lowercase letter");
        }

        System.out.println();
        System.out.println("According to Character.isUpperCase:");
        char checkIsUpperCase = 'P';
        if (Character.isUpperCase(checkIsUpperCase)) {
            System.out.println(checkIsUpperCase + " is a uppercase letter");
        } else {
            System.out.println(checkIsUpperCase + " is not a uppercase letter");
        }

        System.out.println();
        char smallcase = 'u';
        char bigcase = Character.toUpperCase(smallcase);
        System.out.println(smallcase + " converted to uppercase is " + bigcase);
        System.out.println(bigcase + " converted to lowercase is " + Character.toLowerCase(bigcase));
    }
}
