package class2;

public class Exercise1 {

    /**
     *  Exercise1: Character Conversion and its ASCII value
     */
    public static void main(String[] args) {

        int num = '7' - '0';
        System.out.println("The result of '7' - '0' is " + num);

        int char7 = '7';
        System.out.println("The ASCII value of '7' is " + char7);

        int char0 = '0';
        System.out.println("The ASCII value of '0' is " + char0);

        // 8-bit ASCII code
        System.out.println();
        for (int i = 0; i <= 255; i++) {
            System.out.println("#" + i + ": " + (char) i);
        }
    }
}
