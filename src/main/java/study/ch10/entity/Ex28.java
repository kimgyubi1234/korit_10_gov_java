package study.ch10.entity;

public class Ex28 {
    //위와 같은 배열에서 각 열의 합계를 구하여 출력하시오.
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int[] colSums = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) { //nums[i].length 열의 배수에 대한 갯수
                int num = k + 1;
                nums[i][k] = num + (i * nums[i].length);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) {
                colSums[k] += nums[i][k];
            }
        }
        System.out.println();
    }
}