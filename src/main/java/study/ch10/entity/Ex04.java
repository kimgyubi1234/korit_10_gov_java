package study.ch10.entity;

public class Ex04 {
    public static void main(String[] args) {
        int [] arr = new int[] {44, 11, 77, 33, 55};
        int min = arr[0];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                num = i;
            }
        }
        System.out.println("최소값: " + min);
        System.out.println("위치: " + num);
    }
}
