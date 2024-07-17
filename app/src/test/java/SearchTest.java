import hexlet.code.SearchEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class SearchTest {

    @Test
    public void testSearchPositive() {
        var doc1 = "I can't shoot straight unless I've had a pint!";
        var doc2 = "Don't shoot shoot shoot that thing at me.";
        var doc3 = "I'm your shooter.";

        List<Map<String, String>> docs = List.of(
                Map.of("id", "doc1", "text", doc1),
                Map.of("id", "doc2", "text", doc2),
                Map.of("id", "doc3", "text", doc3)
        );

        List<String> result = SearchEngine.search(docs, "shoot");

        System.out.println(result);

        assertEquals(2, result.size());
        assertTrue(result.contains("doc1"));
        assertTrue(result.contains("doc2"));
    }

    @Test
    public void t() {
        System.out.println("!");
        boolean r = SearchEngine.test();
        System.out.println("r = " + r);
        assertFalse(r);
    }


    @Test
    public void testSearchNegative() {
        var doc1 = "I can't shoot straight unless I've had a pint!";
        var doc2 = "Don't shoot shoot shoot that thing at me.";
        var doc3 = "I'm your shooter.";

        List<Map<String, String>> docs = List.of(
                Map.of("id", "doc1", "text", doc1),
                Map.of("id", "doc2", "text", doc2),
                Map.of("id", "doc3", "text", doc3)
        );

        List<String> result = SearchEngine.search(docs, "qwerty");

        System.out.println(result);

        assertEquals(2, result.size());
        assertTrue(result.contains("doc1"));
        assertTrue(result.contains("doc2"));
    }

    @Test
    public void testSearchEmptyDocs() {
        List<Map<String, String>> docs = List.of();
        List<String> result = SearchEngine.search(docs, "shoot");

        System.out.println(result);

        assertEquals(0, result.size());
    }
}