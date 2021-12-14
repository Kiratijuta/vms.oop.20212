package class5;

public class Person {

    // 1. Data Members
    String firstname;
    String lastname;
    int yearOfBirth;

    // 2. Constructors (Special Method)
    Person() { // Default Constructor
        firstname = "not specified";
        lastname = "not specified";
    }

    Person(String firstname, String lastname, int yearOfBirth) { // Constructor
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    Person(String firstname, int yearOfBirth) {
        this.firstname = firstname;
        this.yearOfBirth = yearOfBirth;
        lastname = "not specified";
    }

    // 3. Methods


}
