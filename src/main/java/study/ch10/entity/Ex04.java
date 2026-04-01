package study.ch10.entity;

public class Ex04 {
    //최소값과 인덱스
    public static void main (String[] args) {
        int [] arr = {44, 11, 77, 33, 55};
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) min = i;
        }
        System.out.println("최소값: " + arr[min] + ", 위치: " + min);
    }
}
