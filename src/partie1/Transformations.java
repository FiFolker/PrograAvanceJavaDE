package partie1;

public enum Transformations {
    TO_UPPERCASE((s) -> s.toUpperCase()),
    TO_LOWERCASE((s) -> s.toLowerCase());

    private final Transformer<String, String> genericTransformer;

    private Transformations(Transformer<String, String> genericTransformer){
        this.genericTransformer = genericTransformer;
    }

    public String apply(String input) {
        return genericTransformer.apply(input);
    }
}
