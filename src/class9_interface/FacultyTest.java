package class9_interface;

public class FacultyTest {

    public static void main(String[] args) {
        Faculty vms = new VMS();
        System.out.println(vms.numberOfStudents);
        Faculty bba = new BBA();
        System.out.println(bba.numberOfStudents);

        printFacultyName(vms);
        printFacultyName(bba);
    }

    public static void printFacultyName(Faculty f) {
        System.out.println(f.getName());
    }

}
