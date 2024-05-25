public class SquarePegAdapter  extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(int radius, SquarePeg peg) {
        super(radius);
        this.peg = peg;
    }

    @Override
    public int getRadius(){
        return (int) Math.sqrt(peg.getWidth() * peg.getWidth() + peg.getWidth() * peg.getWidth()) / 2;
    }
}
