package partie1;

public class StringLengthTransformer implements Transformer<String, Integer>{
    private Transformer<String, Integer> transformer;

    public StringLengthTransformer(Transformer<String, Integer> transformer) {
        this.transformer = transformer;
    }

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
