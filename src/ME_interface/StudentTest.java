package ME_interface;

public class StudentTest {

    public static void main(String[] args) {
//        Student jack = new Student("6210121", "Jack", "Haha");
        Student danny = new Undergraduate("6212856", "Danny", "Aroi");
        Student henry = new Graduate("6219865", "Henry", "Chick");

        henry.setScore(0, 5);
        henry.setScore(1, 2);
        henry.setScore(2, 1);
        henry.setScore(3, 4);
        if (henry.setScore(4, 9)) {
            System.out.println("Can set the score");
        } else {
            System.out.println("Cannot set the score");
        }

//        System.out.println(jack.toString());
        System.out.println(danny.toString());
        System.out.println(henry.toString());
    }
}
