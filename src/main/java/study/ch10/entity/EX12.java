package study.ch10.entity;

public class EX12 {
    //String 배열의 모든 요소를 "/"로 연결해 하나의 문자열로 출력하시오
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        StringBuilder sb = new StringBuilder(); // 클래스 변수명 = 생성자 호출
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]); // 변수명.메서드(배열 요소, arr 배열의 i번째 방에 있는 값)
            if (i < arr.length - 1) sb.append(" / "); //.append()는 끝에 덧붙이라는 명령어
        }
        System.out.println(sb.toString()); //.toString() 메서드로 문자열로 바꿈
    }
}