package CreationalPattern;

public class PrototypeTest {

    public static void main(String[] args) {

        Student s1 = new Student(5000);
        try {
            Student s2 = (Student) s1.clone();
            s2.id = 5555;

            System.out.println(s1);
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println("Something went wrong. " + e.toString());
        }
    }

}

class Student {

    int id = 0;

    public Student(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloneStudent = new Student(this.id);
        return cloneStudent;
    }
}
