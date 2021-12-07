package class4;

public class SwapVariableV2 {

    public static void main(String[] args) {
        int a = -56;
        int b = 98;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a value is " + a);
        System.out.println("b value is " + b);
    }

}
