package partie3;

public class HoneyCheck extends ArabicAbstractPastryCheck{

    protected HoneyCheck() {
        super((arabicPastry) -> arabicPastry.containsHoney());
    }
}
