package study.ch10.entity;

public class Ex15 {
    // for each vs for 비교
    // int 배열에서 인덱스가 짝수인 요소만 합산
    // for-each는 왜 불가능인지 주석으로 설명하시오
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                sum += arr[i];
            }
        } System.out.println("합계: " + sum);
    }
} // for-each는 인덱스를 알 수 없어서 for을 사용한다
