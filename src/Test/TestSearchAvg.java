import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestSearchAvg {

    @Test
    public void testArrayListIntSearchAvg() {
        List<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(4);
        collection.add(1);
        collection.add(9);
        assertEquals(UtilityCollection.searchAvg(collection), new Integer(4));
    }

    @Test
    public void testArrayListStringSearchAvg() {
        List<String> collection = new ArrayList<>();
        collection.add("Anna");
        collection.add("Pasha");
        collection.add("Misha");
        collection.add("Alexandr");
        collection.add("Veronika");

        assertEquals(UtilityCollection.searchAvg(collection), "Misha");
    }

    @Test
    public void testLinkedListIntSearchAvg() {
        List<Integer> collection = new LinkedList<>();
        collection.add(2);
        collection.add(4);
        collection.add(1);
        assertEquals(UtilityCollection.searchAvg(collection), new Integer(2));
    }
    @Test
    public void testSetIntSearchAvg() {
        Set<Integer> collection = new LinkedHashSet<>();
        collection.add(4);
        collection.add(1);
        collection.add(2);

//        System.out.println(collection.toString());
//        assertEquals(UtilityCollection.searchAvg(collection), new Integer(1));
    }
}