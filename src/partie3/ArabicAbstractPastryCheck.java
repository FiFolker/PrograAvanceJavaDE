package partie3;

public abstract class ArabicAbstractPastryCheck{
    private Predicate predicate;
    private ArabicAbstractPastryCheck next;

    protected ArabicAbstractPastryCheck(Predicate predicate) {
        this.predicate = predicate;
    }

    public final boolean check(ArabicPastry pastry){
        return this.predicate.matches(pastry);
    }

    public void addNext(ArabicAbstractPastryCheck nextCheck){
        this.next = nextCheck;
    }
}
