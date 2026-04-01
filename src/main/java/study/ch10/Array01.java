package study.ch10;

public class Array01 {
    public static void main(String[] args) {
        int [] nums1 = new int[5];
        int [] nums2 = new int[] {10, 20, 30, 40, 50};
        int [] nums3 = {10, 20, 30, 40, 50};

        // 배열 값 참조
        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
        System.out.println(nums3[2]);
        int num1 = nums1[1];
        int num2 = nums2[1];
        int num3 = nums3[1];
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // 배열 값 대입
        nums1[0] = 100;
        nums2[1] = 1000;
        nums2[2] = 10000; //값을 바꾸는건 가능하나 늘이는건 안됨
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
