package study.ch10.entity;

public class Ex03 {
    public static void main(String[] args) {
        int [] arr = new int[] {34, 78, 12, 56, 91, 23};
        int max = 0;
        for (int i : arr) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("최대값: " + max);
    }
}
