
import java.util.ArrayList;

public final class UtilityArrayList {

    public static <T> ArrayList<T> filter(ArrayList<T> elements, Predicate<T> predicate) {
        if (elements == null) {
            throw new IllegalArgumentException("elements = null");
        }
        if (predicate == null) {
            throw new IllegalArgumentException("predicate = null");
        }
        ArrayList<T> result = new ArrayList<>();
        for (T item : elements) {
            if (predicate.condition(item)) {
                result.add(item);
            }
        }
        return result;
    }
}