package class3;

public class Exercise1 {

    /**
     *  Exercise1: Passing primitive data types to a function
     *             (Passed-by-value)
     */
    public static void main(String[] args) {
        int x = 1234;

        setNewValue(x);
        System.out.println(x);
    }

    public static void setNewValue(int number) {
        number = 0;
    }

}
