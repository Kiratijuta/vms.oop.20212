package ME_interface;

public abstract class Student implements StudentScore {

    private String id;
    private String firstname;
    private String lastname;
    private int[] scores;

    Student(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        scores = new int[] {0, 0, 0, 0, 0};
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname;
    }
}
