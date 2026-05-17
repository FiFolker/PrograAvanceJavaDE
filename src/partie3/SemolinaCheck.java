package partie3;

public class SemolinaCheck extends ArabicAbstractPastryCheck{
    protected SemolinaCheck() {
        super((a) -> a.containsSemolina());
    }
}
