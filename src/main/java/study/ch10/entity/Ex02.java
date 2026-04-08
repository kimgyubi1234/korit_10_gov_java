package study.ch10.entity;

public class Ex02 {
    public static void main(String[] args) {
        int [] arr = new int[] {85, 92, 78, 96, 88};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + (double)sum/arr.length);
    }
}

//int[] arr = {85, 92, 78, 96, 88};
//int sum = 0;
//for (int n : arr) {
//    sum += n;
//}
//System.out.println("합계: " + sum);
//System.out.printf("평균: %.1f%n", (double) sum / arr.length);