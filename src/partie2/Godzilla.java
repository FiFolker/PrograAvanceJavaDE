package partie2;

public class Godzilla extends Monster{
    public Godzilla() {
        super(new HitLikeABigMonster(new HitNone()));
    }
}
