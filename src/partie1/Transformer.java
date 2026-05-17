package partie1;

@FunctionalInterface
public interface Transformer<Input, Output>{
    Output apply(Input input);
}
