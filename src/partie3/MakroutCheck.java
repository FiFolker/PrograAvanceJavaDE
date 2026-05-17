package partie3;

public class MakroutCheck extends ArabicAbstractPastryCheck{
    protected MakroutCheck() {
        super((a) -> new HoneyCheck().check(a) && new SemolinaCheck().check(a) && new BakedCheck().check(a));
    }
}
