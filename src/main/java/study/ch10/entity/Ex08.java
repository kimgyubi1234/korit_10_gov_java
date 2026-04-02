package study.ch10.entity;

public class Ex08 {
    //배열 역순 뒤집기. 순서를 실제로 뒤집어라 >> 배열 사용 금지
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            // arr.length / 2가 되어 1 -> 5로 2 -> 4가 되어 2번 반복하게 한다
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = temp;
        }
        for (int n : arr) System.out.print(n + " ");

        //새로운 배열인 경우
//        int[] nums = {1, 2, 3, 4, 5};
//        int[] reversedNums = new int[5];
//
//        for (int i = 0; 0 < nums.length; i++) {
//            reversedNums[nums.length -1 -i] = nums[i];
//        }
//        System.out.println(Arrays.toString(reversedNums));
    }
}
