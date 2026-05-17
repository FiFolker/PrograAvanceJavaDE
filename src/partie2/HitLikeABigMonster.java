package partie2;

public class HitLikeABigMonster extends DecoratorBehaviorHit{
    public HitLikeABigMonster(BehaviorHit behaviorHit) {
        super(behaviorHit);
    }

    @Override
    protected void decoratedHit() {
        System.out.println("Ce monstre tape comme un gros monstre");
    }
}
