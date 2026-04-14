package study.ch16.Ex;

import java.util.List;

public class Ex28 {
    static double sumList(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }
}
