package class9_abstract;

public class FacultyTest {

    public static void main(String[] args) {
        Faculty vms = new VMS();
        vms.numberOfStudents = 100;
        Faculty bba = new BBA();
        bba.numberOfStudents = 650;

        printFacultyName(vms);
        printFacultyName(bba);
    }

    public static void printFacultyName(Faculty f) {
        System.out.println(f.getName());
    }

}
