package partie2;

public abstract class DecoratorBehaviorHit implements BehaviorHit {
    private BehaviorHit behaviorHit;

    public DecoratorBehaviorHit(BehaviorHit behaviorHit) {
        this.behaviorHit = behaviorHit;
    }

    @Override
    public void hit(){
        this.behaviorHit.hit();
        this.decoratedHit();
    }

    protected abstract void decoratedHit();
}
