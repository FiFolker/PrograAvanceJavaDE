package partie2;

public abstract class Monster {
    public void setBehaviorHit(BehaviorHit behaviorHit) {
        this.behaviorHit = behaviorHit;
    }

    private BehaviorHit behaviorHit;

    public Monster(BehaviorHit behaviorHit) {
        this.behaviorHit = behaviorHit;
    }

    public void hit(){
        this.behaviorHit.hit();
    }
}
