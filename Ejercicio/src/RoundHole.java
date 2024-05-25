public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius >= peg.getRadius());
        return result;
    }
}
