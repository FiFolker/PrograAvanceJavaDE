package partie3;

public class BakedCheck extends ArabicAbstractPastryCheck{
    protected BakedCheck() {
        super((a) -> a.isBaked());
    }
}
