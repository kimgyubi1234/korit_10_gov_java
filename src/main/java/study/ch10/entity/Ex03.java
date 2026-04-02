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

//        // 다르게
//        int [] nums = {34, 78, 12, 56, 91, 23};
//        int max = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (i == 0) {
//                max = nums[i]; //첫번째 반복때는 첫번째가 최대값이다
//                continue;
//            }
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        System.out.println("최대값: " + max);
    }
}
// 그럼 그대로 출력 안되고 다시 돌아가는가?