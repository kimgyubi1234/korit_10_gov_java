package study.ch10.entity;

public class Ex16 {
    public static void main(String[] args) {
        int[] arr = {45, 78, 12, 91, 34, 67};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }
        System.out.println("두 번째 최대값: " + second);
    }
}
