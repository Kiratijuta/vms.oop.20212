package class5;

public class DiceGame {

    int numberOfDice;
    Dice dices[];

    int accumulateScore;

    DiceGame() {
        numberOfDice = 1;
        dices = new Dice[numberOfDice];
        dices[0] = new Dice();

        accumulateScore = 0;
    }

    DiceGame(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        dices = new Dice[numberOfDice];
        for (int i = 0; i < numberOfDice; i++) {
            dices[i] = new Dice();
        }

        accumulateScore = 0;
    }

    int play() {
        int score = 0;
        for (int i = 0; i < numberOfDice; i++) {
            int topValue = dices[i].rolls();
            System.out.println("D" + (i+1) + " " + topValue);
            score += topValue;
        }

        return score;
    }

}
