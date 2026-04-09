package study.ch23;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30 ,40); //초기화/ map을 다 써버려서 10, 20..이 사라짐
        Stream<Integer> numStream2 = numStream.map(num -> num * 10); //중간 연산

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);

        System.out.println(numStream3.toList());//최종
        //System.out.println(numStream2.toList()); // 이미 위에서 출력으로 사용해서 나오지 않음
    }
}
