package ME;

public class Undergraduate extends Student {

    private String SeniorProjectTitle;

    Undergraduate(String id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public String getSeniorProjectTitle() {
        return SeniorProjectTitle;
    }

    public void setSeniorProjectTitle(String seniorProjectTitle) {
        SeniorProjectTitle = seniorProjectTitle;
    }

    @Override
    public int totalScore() {
        return super.totalScore();
    }

    @Override
    public String toString() {
        return getId() + " Undergraduate " + totalScore();
    }
}
