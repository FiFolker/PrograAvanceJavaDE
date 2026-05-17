package partie2;

public class Kong extends Monster{
    public Kong() {
        super(new HitLikeABigMonster(new HitNone()));
    }
}
