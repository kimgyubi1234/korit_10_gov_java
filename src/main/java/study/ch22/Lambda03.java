package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> lsit, Predicate<String> p) {
        for (String s : lsit) {
            if (p.test(s)) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOFRanger(int multNum, Function<Integer, List<Integer>> f) {
        return f.apply(multNum);
    }

    public static void main(String[] args) {
        String searchName = "김준이";
        List<String> names = List.of("김준일", "김준이", "김준삼");
        String foundName = search(names, name -> name.equals("김준일"));
        System.out.println(foundName);
        applicationMain(() -> {
            List<Integer> numList = createNumListOFRanger(10, multNum -> {
                int start = 10;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                    nums.add(i  * multNum);
                }
                return nums;
            });
            System.out.println(numList);
        });
        System.out.println("프로그램 진짜 종료");
    }
}
