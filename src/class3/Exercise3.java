package class3;

public class Exercise3 {

    public static void main(String[] args) {

        int studentIds[] = new int[5];
        studentIds[0] = 1000;
        studentIds[1] = 1001;
        studentIds[2] = 1002;
        studentIds[3] = 1003;
        studentIds[4] = 1004;

        System.out.println(studentIds);
        System.out.println(studentIds[0]);
        resetArrayInt(studentIds);
        System.out.println(studentIds[0]);
    }

    public static void resetArrayInt(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }
}
