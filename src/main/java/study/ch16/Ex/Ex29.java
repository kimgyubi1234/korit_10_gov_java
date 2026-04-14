package study.ch16.Ex;

import java.util.ArrayList;
import java.util.List;

public class Ex29 {
    static List<String> filterByLength(List<String> list, int minLength) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.length() >= minLength) result.add(s);
        }
        return result;
    }
}
