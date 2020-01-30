import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFilter {
    @Test
    public void testIntFilter() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);

        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(8);

        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public <S extends Integer> boolean condition(S value) {
                return value.intValue() % 2 == 0;
            }
        };
        assertEquals(UtilityArrayList.filter((ArrayList<Integer>) list, even), result);
    }

    @Test
    public void testStringFilter() {
        List<String> list = new ArrayList<>();
        list.add("Max");
        list.add("Anna");
        list.add("Dasha");

        List<String> result = new ArrayList<>();
        result.add("Anna");
        result.add("Dasha");

        Predicate<String> sizeMoreThree = new Predicate<String>() {
            @Override
            public <S extends String> boolean condition(S value) {
                return value.length() > 3;
            }
        };
        assertEquals(UtilityArrayList.filter((ArrayList<String>) list, sizeMoreThree), result);
    }

}