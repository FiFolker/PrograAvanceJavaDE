package partie2;

public class Jad extends Monster{
    public Jad() {
        super(new HitLikeATench(new HitNone()));
    }
}
