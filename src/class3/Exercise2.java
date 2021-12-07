package class3;

public class Exercise2 {

    /**
     *  Exercise2: Passed-by-object-reference will affect the original
     */
    public static void main(String[] args) {
        Student s1 = new Student(); // Object Student
        s1.firstName = "Kiratijuta";
        s1.lastName = "Bhumichitr";
        s1.setCreditComplete(142);
        s1.gpa = 3.8;

        System.out.println(s1);
        resetAcademic(s1);
        System.out.println("G.P.A = " + s1.gpa);
        System.out.println("Completed Credit = " + s1.getCreditComplete());
    }

    public static void resetAcademic(Student student) {
        student.creditComplete = 0;
        student.gpa = 0;
        System.out.println(student);
    }

}
