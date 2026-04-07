package study.ch08.entity;
//다음 조건을 만족하는 `MathUtil` 클래스를 작성하시오.
//
//- `int max(int a, int b)` — 두 정수 중 큰 값 리턴
//- `int max(int a, int b, int c)` — 세 정수 중 큰 값 리턴
//- `double max(double a, double b)` — 두 실수 중 큰 값 리턴

class MathUtil {
    int max (int a, int b) {
        return (a > b ? a : b);
    }

    int max (int a, int b, int c) {
        return max(max(a, b), c); // 위의 기존 메서드 재활용
    }

    double max (double a, double b) {
        return (a > b ? a : b);
    }
}

public class Ex09 {
}
