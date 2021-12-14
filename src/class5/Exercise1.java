package class5;

public class Exercise1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstname = "Kiratijuta";
        p1.lastname = "Bhumichitr";
        p1.yearOfBirth = 1992;

        System.out.println(p1.firstname);
        System.out.println(p1.lastname);
        System.out.println(p1.yearOfBirth);

        Person p2 = new Person("Jim", 1990);

        System.out.println(p2.firstname);
        System.out.println(p2.lastname);
        System.out.println(p2.yearOfBirth);
    }

}
