package study.ch08.entity;
//다음 조건을 만족하는 `StringJoiner` 클래스를 작성하시오.
//
//- `String join(String a, String b)` — "a+b" 형태로 리턴
//- `String join(String a, String b, String c)` — "a+b+c" 형태로 리턴
//- `String join(String[] arr)` — 배열 요소를 "+"로 연결하여 리턴

class StringJoiner {
    String join (String a, String b){
        return a + "+" + b;
    }
    String join (String a, String b, String c) {
        return a + "+" + b + "+" + c;
    }
    String join (String[] arr) {
        StringBuilder sb = new StringBuilder(); // append 사용시 StringBuilder도 사용
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]); //append는 기존 글자 끝에 다른 글자를 붙임
            if (i < arr.length - 1) sb.append("+");
        }
        return sb.toString(); // toString() 더이상 수정할 수 없는 최종 출력
    }
}

public class Ex12 {
}
