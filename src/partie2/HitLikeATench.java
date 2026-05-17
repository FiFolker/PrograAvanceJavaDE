package partie2;

public class HitLikeATench extends DecoratorBehaviorHit{
    public HitLikeATench(BehaviorHit behaviorHit) {
        super(behaviorHit);
    }

    @Override
    protected void decoratedHit() {
        System.out.println("Ce monstre tape comme une tanche");
    }
}
