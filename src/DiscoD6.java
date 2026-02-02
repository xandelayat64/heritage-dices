public class DiscoD6 extends D6 {

    //@Override
    protected void rollExtended(final int result) {
        if (result == this.getNbSides()) {
            System.out.println("GG !");
        }
    }
}
