package study.ch22;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda02 {
    public static void main(String[] args) {

        Runnable r = () -> {  //매개변수와 리턴이 없음
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        };
        Consumer<String> c1 = str -> System.out.println("문자열: " + str); //매개변수 있음, 리턴 없음
        Consumer<List<Integer>> c2 = numList -> {
            for (Integer i : numList) {
                System.out.println("i: " + i);
            }
        };
        //위는 정의. 아래가 실행.
        c2.accept(List.of(10, 20, 30, 40));
        c1.accept("김준일");
        r.run();

        Supplier<Character> s1 = () -> {
            System.out.println("Suppllier 객체 호출");
            String str = "abcd";
            return str.charAt(0);
        };

        Supplier<Character> s2 = () -> "abcd".charAt(0);
        System.out.println(s1.get());
        System.out.println(s2.get());

        String name = "김준일";
        Supplier<Character> s3 = () -> {
            System.out.println(name);
            return name.charAt(0);
        };
        System.out.println(s3.get());

        Function<String, Integer> intparser = strData -> {
            Integer numData = Integer.parseInt(strData);
            return numData;
        }; // 여기까지가 메서드 오버라이드
        System.out.println(intparser.apply("1000") + 200);

        Predicate<String> p = n -> "김준일".equals(n); //boolean 타입이 고정
        System.out.println(p.test("김준이"));
    }
}
