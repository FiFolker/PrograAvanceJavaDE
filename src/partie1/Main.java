package partie1;

public class Main {
    public static void main() {
        StringLengthTransformer str = new StringLengthTransformer((s) -> s.length());
        GenericTransformer<String, Integer> generic = new GenericTransformer<>((s) -> s.length());
    }

}