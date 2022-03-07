package class11;

public class Person {

    String name;
    String lastname;
    String department;
    String joinDate;

    Person supervisor;

    Person(String name, String lastname, String department, String joinDate) {
        this.name = name;
        this.lastname = lastname;
        this.department = department;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", superisor=" + supervisor +
                '}';
    }
}
