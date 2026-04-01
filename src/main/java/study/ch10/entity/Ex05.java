package study.ch10.entity;

public class Ex05 {
    //짝수만 출력
    public static void main (String[] args) {
        int [] arr = {3, 8, 15, 22, 7, 36, 41};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("이것은 정답지 입니다.");

        for (int n : arr) {
            if (n % 2 == 0) System.out.print(n + " ");
        }
    }
}
