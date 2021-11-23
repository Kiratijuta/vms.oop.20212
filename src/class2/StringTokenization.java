package class2;

public class StringTokenization {

    public static void main(String[] args) {

        String names = "Fair,James,Yong,Tiew";
        String nameArray[] = names.split(","); // The coma is delimiter (or separator)

        System.out.println(nameArray[0]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);
        System.out.println(nameArray[1]);
    }
}
