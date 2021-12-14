package class5;

public class Exercise3 {

    public static void main(String[] args) {

        Dice d1 = new Dice();
        System.out.println(d1.topValue);
        d1.rolls();
        System.out.println(d1.topValue);

        d1.rolls();
        d1.rolls();
        d1.rolls();
        d1.rolls();
        d1.rolls();
        d1.rolls(100);
        System.out.println(d1.accumulateScore);


    }

}
