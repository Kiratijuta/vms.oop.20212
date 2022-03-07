package class11;

public class Company {

    public static void main(String[] args) {

        Person newbie1 = new Person("John", "Trump", "Design", "8/2/22");
        Person newbie2 = new Person("Rose", "Maxim", "iOS", "8/2/22");

        Person boss = new Person("Fair", "Bhumichitr", "Mobile", "22/11/15");
        newbie1.supervisor = boss;
        newbie2.supervisor = boss;

        System.out.println(newbie1);

    }

}
