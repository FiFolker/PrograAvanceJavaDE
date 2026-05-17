package partie2;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Jad();
        monster1.hit();
        monster1.setBehaviorHit(new HitLikeATench(new HitLikeABigMonster(new HitNone())));
        monster1.hit();
    }
}
