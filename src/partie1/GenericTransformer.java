package partie1;

public class GenericTransformer<T,R> {
    private Transformer<T, R> transformer;
    public GenericTransformer(Transformer<T, R> transfromer) {
        this.transformer = transfromer;
    }

    R apply(T t){
        return this.transformer.apply(t);
    }
}
