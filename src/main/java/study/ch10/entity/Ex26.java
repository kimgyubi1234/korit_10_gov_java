package study.ch10.entity;

import java.util.Arrays;

public class Ex26 {
    //3×3 int 배열을 생성하고 1~9로 채운 뒤 행렬 형태로 출력하시오.
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) { //nums[i].length 열의 배수에 대한 갯수
                int num = i + k;
                nums[i][k] = num + (i * nums[i].length);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
