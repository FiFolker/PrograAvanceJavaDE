package partie3;

public class MakroutCheck extends ArabicAbstractPastryCheck {
    protected MakroutCheck() {
        super((a) -> true);
        this.addNext(new SemolinaCheck());
        this.addNext(new HoneyCheck());
        this.addNext(new BakedCheck());
    }
}
