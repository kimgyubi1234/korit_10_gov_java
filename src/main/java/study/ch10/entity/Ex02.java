package study.ch10.entity;

public class Ex02 {
    public static void main (String[] args){

        //int 배열 {85, 92, 78, 96, 88}의 합계와 평균을 구하여 출력하시오.
        int [] arr = {85, 92, 78, 96, 88};
        int sum = 0;
        // for (int i = 0; i < arr.length; i++)
        for (int n : arr) { // arr의 첫번째부터 마지막까지 순서대로 돌면서,
            // 그 칸에 있는 값을 n이란 이름표를 붙여서 꺼낸다
            sum += n; // 꺼낸 값을 sum에 누적한다
        }
        System.out.println("합계: " + sum);
        System.out.printf("평균: %.1f%n", (double) sum / arr.length);
    }
}
