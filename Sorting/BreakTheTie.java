
import java.util.Collections;
import java.util.*;

public class BreakTheTie {

    public static void main(String[] args) {
        String[] arr = { "Truin", "Nick", "Truin", "Nick", "Adwin", "Ruyk" };
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String str : arr) {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getKey()).compareTo(o2.getKey());
            }
        });

        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap) {
                maxValueInMap = val;
                winner = key;
            } else if (val == maxValueInMap && winner.compareTo(key) > 0)
                winner = key;
        }

        System.out.println(winner);

    }

}
