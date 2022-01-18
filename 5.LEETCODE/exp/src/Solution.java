import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, len = t.length(); i < len; ++i) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int r = 0, ans = s.length();
        for (int l = 0, len = s.length(); l < len; ++l) {
            while (r < len) {
                if (map.size() == 0) break;
                char c = s.charAt(r);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0) {
                        map.remove(c);
                    }
                }
            }
            ans = Math.min(ans, r - l + 1);


        }
    }
}