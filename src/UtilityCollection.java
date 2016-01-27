import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class UtilityCollection {
    public static <T extends Comparable<? super T>> T searchAvg(Collection<? extends T> compareElements) {
        if (compareElements == null) {
            throw new IllegalArgumentException("collection = null");
        }
        if (compareElements.size() == 0) {
            throw new IllegalArgumentException("collection is empty");
        }
        Comparator<? super T> comparator = new Comparator<T>() {
            @Override
            public int compare(T left, T right) {
                return left.compareTo(right);
            }
        };
        java.util.Collections.sort((List<T>) compareElements, comparator);
        int avg = compareElements.size() / 2;
        return (T) ((List<T>) compareElements).get(avg);
    }
}
