package class4;

public class SeeDefaultValue {

    public static void main(String[] args) {

        AccessLevel s = new AccessLevel();
        System.out.println(s.number);
        System.out.println(s.role);
        s.isCLevel = true;
        System.out.println(s.isCLevel);

        AccessLevel x = new AccessLevel();
        x.role = "CEO";
        x.isCLevel = true;
        System.out.println(x.number);
        System.out.println(x.role);
        System.out.println(x.isCLevel);

        System.out.println(s.role);
    }

}
