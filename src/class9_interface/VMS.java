package class9_interface;

public class VMS implements Faculty {
    @Override
    public String getUniversity() {
        return "Assumption University";
    }

    @Override
    public String getName() {
        return "Vincent Mary School of Science and Technology";
    }

    @Override
    public String getBuilding() {
        return "VMS Building";
    }
}
