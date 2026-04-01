package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }
        // 위 아래가 같은 코드. 변수명에 집중하기
        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"김준일", "김준이", "김준삼"};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }
        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 10;
        }

        for (int num : nums) {
            num = num * 10;
        }
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
