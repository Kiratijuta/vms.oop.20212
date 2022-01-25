package class9_interface;

public class BBA implements Faculty {
    @Override
    public String getUniversity() {
        return "Assumption University";
    }

    @Override
    public String getName() {
        return "Business Administration";
    }

    @Override
    public String getBuilding() {
        return "MSME Building";
    }
}
