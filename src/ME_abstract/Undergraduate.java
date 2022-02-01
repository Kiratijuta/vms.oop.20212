package ME_abstract;

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
    public int getScore(int testNumber) {
        if (testNumber < 0 || testNumber >= 5) {
            return -1; // Assume that -1 is an invalid number
        }
        return getScores()[testNumber];
    }

    @Override
    public boolean setScore(int testNumber, int score) {
        if (testNumber < 0 || testNumber >= 5) {
            return false;
        }
        if (score < 0 || score > 5) {
            return false;
        }
        getScores()[testNumber] = score;
        return true;
    }

    @Override
    public int totalScore() {
        return (getScores()[0] + getScores()[1] + getScores()[2] + getScores()[3] + getScores()[4]) / 5;
    }

    @Override
    public String toString() {
        return getId() + " Undergraduate " + totalScore();
    }
}
