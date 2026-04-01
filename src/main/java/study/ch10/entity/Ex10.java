package study.ch10.entity;

public class Ex10 {
    // 배열 요소 2배 변환. int 배열 {}의 모든 요소를 2배로 만든 뒤 출력하시오
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        for (int n : arr) {
            int pro = n * 2;
            System.out.print(pro + " ");
        }

        System.out.println(" ");
        System.out.println("다음은 정답지 입니다.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        for (int n : arr) System.out.print(n + " ");
    }
}