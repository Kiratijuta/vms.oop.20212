package class9_abstract;

public abstract class Faculty {

    int numberOfStudents = 0;

    public String getUniversity() {
        return "Assumption University";
    }

    public abstract String getName();
    public abstract String getBuilding();

}
