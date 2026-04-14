package study.ch16.Ex;

import java.util.Map;

public class Ex30 {
    static String getMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey;
    }
}
