package class8;

import class6.Circle;

public class PolymorphismDemo {

    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        Object s = new Student();
        Student s1 = (Student) s;
        Person p = new Person();
        Circle c = new Circle();

        printSth(g);
        printSth(s);
        printSth(p);
    }

    public static void printSth(Object p) {
        System.out.println(p.toString());
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student {

}