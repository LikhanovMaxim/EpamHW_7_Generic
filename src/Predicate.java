public interface Predicate<T> {
    public <S extends T> boolean condition(S value);
}
