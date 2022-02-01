package ME_interface;

public interface StudentScore {

    public abstract int getScore(int testNumber);
    public abstract boolean setScore(int testNumber, int score);
    public abstract int totalScore();

}
