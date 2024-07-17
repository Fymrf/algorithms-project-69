package hexlet.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchEngine {
    public static List<String> search(List<Map<String, String>> docs, String toFind) {
        List<String> findIds = new ArrayList<>();
        for (Map<String, String> doc : docs) {
            String text = doc.get("text");
            if (text.contains(toFind)) {
                findIds.add(doc.get("id"));
            }
        }

        return findIds;
    }
}