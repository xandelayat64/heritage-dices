import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        D6 myD6 = new D6();
        Coin myCoin = new Coin();
        D20 myD20 = new D20();

        ArrayList<Dice> dices = new ArrayList<>();
        dices.add(myD6);
        dices.add(myD20);
        dices.add(myCoin);
        dices.add(new TrickD6());
        dices.add(new DiscoD6());

        for (Dice dice : dices) {
            System.out.println(dice.toPrettyString() + " " + dice.roll(20));
        }
    }
}
