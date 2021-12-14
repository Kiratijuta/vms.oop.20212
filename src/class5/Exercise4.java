package class5;

public class Exercise4 {

    public static void main(String[] args) {

        DiceGame game = new DiceGame(4);
        int score = game.play();
        System.out.println("Score " + score);
    }

}
