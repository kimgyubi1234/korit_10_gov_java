package study.ch10.entity;

public class Ex03 {
    //최대값 구하기
    public static void main (String[] args) {
        int [] arr = {34, 78, 12, 56, 91, 23};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("최대값: " + max);
    }
}
