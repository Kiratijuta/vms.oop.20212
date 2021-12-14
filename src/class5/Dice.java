package class5;

import java.util.Random;

public class Dice {

    int maxNumberOfFaceValue;
    int minNumberOfFaceValue;
    int topValue;
    String color;
    String size; // S, M, L

    int accumulateScore;

    Dice() {
        maxNumberOfFaceValue = 6;
        minNumberOfFaceValue = 1;
        topValue = 1;
        color = "White";
        size = "S";
    }

    int rolls() {
        Random rand = new Random();
        int x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
        topValue = x;

        // extra rule
        if (topValue == 6) {
            x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
            topValue = x;
        }

        accumulateScore += topValue;
        return topValue;
    }

    int rolls(int times) {
        Random rand = new Random();
        for (int i = 0; i < times; i++) {
            int x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
            topValue = x;
            accumulateScore += topValue;
        }

//        accumulateScore += topValue;
        return topValue;
    }

}
