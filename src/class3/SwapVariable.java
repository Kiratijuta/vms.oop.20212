package class3;

public class SwapVariable {

    /**
     *  SwapVariable: Passed-by-value will not affect the original variable value
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        swap(a, b);

        System.out.println("a value is " + a);
        System.out.println("b value is " + b);
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

}
