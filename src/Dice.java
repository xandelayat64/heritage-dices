import java.util.Random;

public abstract class Dice {
    private int nbSides;

    public Dice(int nbSides) {
        this.nbSides = Math.max(2, nbSides);
    }

    public final int getNbSides() {
        return this.nbSides;
    }

    public void setNbSides(int nbSides) {
        nbSides = this.nbSides;
    }

    public final int roll() {
        return new Random().nextInt(this.nbSides) + 1;
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dice dice = (Dice) o;
        return nbSides == dice.nbSides;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "nbSides=" + this.nbSides +
                '}';
    }

    public String toPrettyString() {
        return "D" + this.nbSides;
    }

    public final int roll(int nbRolls) {
        int result = 0;
        for (int i = 0; i < nbRolls; i++) {
            result += this.roll();
        }
        return result;
    }
}
