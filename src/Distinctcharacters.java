import java.util.HashMap;
import java.util.Map;

public class Distinctcharacters {

    public static void findDistinct(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else map.put(str.charAt(i), 1);
        }
        System.out.println(map.entrySet().stream().filter(f -> f.getValue() == 1).map(Map.Entry::getKey).toList().size());

    }
}
